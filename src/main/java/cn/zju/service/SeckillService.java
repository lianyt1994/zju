package cn.zju.service;

import cn.zju.dto.Exposer;
import cn.zju.dto.SeckillExecution;
import cn.zju.bean.Seckill;

import java.util.List;

public interface SeckillService {

    List<Seckill> getSeckillList();

    Seckill getSeckillById(long id);

    Exposer exportSeckillURL(long seckillId);

    SeckillExecution executeSeckill(long seckillId , long userPhone, String md5) throws Exception;
}
