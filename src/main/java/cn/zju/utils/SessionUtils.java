package cn.zju.utils;

import redis.clients.jedis.Jedis;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionUtils {
    public static String getSessionId(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        String userName = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("zjuUserName")){
                userName = cookie.getValue();
                break;
            }
        }
        Jedis jedis = JedisUtils.getJedis();
        String s = jedis.get("loginUser:" +userName);
        if (s != null)return userName;
        else return null;

    }
}
