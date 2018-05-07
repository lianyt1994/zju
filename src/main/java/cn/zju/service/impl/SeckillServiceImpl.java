package cn.zju.service.impl;

import cn.zju.mapper.SeckillDao;
import cn.zju.mapper.SuccessKilledDao;
import cn.zju.dto.Exposer;
import cn.zju.dto.SeckillExecution;
import cn.zju.bean.Seckill;
import cn.zju.bean.SuccessKilled;
import cn.zju.enums.SeckillStateEnum;
import cn.zju.exception.RepeatSeckillException;
import cn.zju.exception.SeckillCloseException;
import cn.zju.exception.SeckillException;
import cn.zju.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;

@Service
public class SeckillServiceImpl implements SeckillService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String SALT = "afsgdasgnsdlvnasdaof";

    @Autowired
    private SeckillDao seckillDao;

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Override
    public List<Seckill> getSeckillList() {
        return seckillDao.queryAll(0, 4);
    }

    @Override
    public Seckill getSeckillById(long id) {
        return seckillDao.queryById(id);
    }

    @Override
    public Exposer exportSeckillURL(long seckillId) {
        Seckill seckill = getSeckillById(seckillId);
        if (seckill == null) {
            return new Exposer(false, seckillId);
        }
        Date startTime = seckill.getStartTime();
        Date endTime = seckill.getEndTime();
        Date nowDate = new Date();
        if (startTime.getTime() > nowDate.getTime() || endTime.getTime() < nowDate.getTime()) {
            return new Exposer(false, seckillId, startTime.getTime(), endTime.getTime());
        }
        return new Exposer(true, getMD5(seckillId), seckillId);
    }

    @Override
    @Transactional
    public SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)throws Exception {
        if(md5 == null || !getMD5(seckillId).equals(md5)){
            throw new SeckillException("seckill data rewrited");
        }
        Date nowTime = new Date();
        try {
            int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
            if(insertCount <= 0){
                throw new RepeatSeckillException("seckill repeat");
            }else{
                int reduceNumber = seckillDao.reduceNumber(seckillId, nowTime);
                if (reduceNumber<=0){
                    throw new SeckillCloseException("seckill close");
                }else{
                    SuccessKilled successKilledinfo = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
                    return new SeckillExecution(seckillId, SeckillStateEnum.SUCCESS,successKilledinfo);
                }
            }
        }catch (RepeatSeckillException e1){
            throw e1;
        }catch (SeckillCloseException e2){
            throw e2;
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            throw new SeckillException("seckill inner error:"+e.getMessage());
        }
    }

    private String getMD5(long seckillId) {
        String base = seckillId + "/" + SALT;
        String MD5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return MD5;
    }
}
