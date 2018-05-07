package cn.zju.mapper;

import cn.zju.bean.User;

public interface LoginMapper {

        public String selectPassWordByName(String userName);


        public void insertNewUser(User user);
}
