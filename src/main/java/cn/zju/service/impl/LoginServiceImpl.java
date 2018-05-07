package cn.zju.service.impl;

import cn.zju.bean.User;
import cn.zju.mapper.LoginMapper;
import cn.zju.service.LoginService;
import cn.zju.utils.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import redis.clients.jedis.Jedis;

@Service
public class LoginServiceImpl implements LoginService {
    static final String LOGINSALT = "gadfjgasdgkasdbnsdkjngfdkj";
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Boolean checkUser(String userName, String passWord) {
        Jedis jedis = JedisUtils.getJedis();
        if (null != jedis.get("loginUser:" + userName)) return true;
        String passWordByName = loginMapper.selectPassWordByName(userName);
        String md5PassWord = DigestUtils.md5DigestAsHex((passWord + LOGINSALT).getBytes());
        if (null == passWordByName || !passWordByName.equals(md5PassWord)) {
            return false;
        } else{
            //将用户存到redis中
            jedis.set("loginUser:" + userName, "ok");
            //设置存在时间为20分钟
            jedis.expire("loginUser:" + userName, 60 * 20);
            return true;
        }
    }

    @Override
    public Boolean insertNewUser(String userName, String passWord) {
        User user = new User();
        if (loginMapper.selectPassWordByName(userName)!=null)return false;
        user.setPassWord(DigestUtils.md5DigestAsHex((passWord + LOGINSALT).getBytes()));
        user.setUserName(userName);
        loginMapper.insertNewUser(user);
        return true;
    }

    @Override
    public Boolean selectUserByName(String userName) {
        String passWordByName = loginMapper.selectPassWordByName(userName);
        if (passWordByName == null)return false;
        else return true;
    }
}
