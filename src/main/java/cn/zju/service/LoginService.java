package cn.zju.service;

import org.springframework.web.bind.annotation.PathVariable;

public interface LoginService {

    public Boolean checkUser(String userName,String passWord);

    public Boolean insertNewUser(@PathVariable("userName") String userName, @PathVariable("passWord") String passWord);

    public Boolean selectUserByName(String userName);

}
