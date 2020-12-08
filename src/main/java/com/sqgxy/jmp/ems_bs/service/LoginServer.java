package com.sqgxy.jmp.ems_bs.service;

import com.sqgxy.jmp.ems_bs.entity.User;
import com.sqgxy.jmp.ems_bs.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServer {
    @Autowired
    LoginMapper loginMapper;
    //登录server
    public User UserLogin(String userName, String userPassword){

        User count=loginMapper.UserLogin(userName,userPassword);
        return count;
    }
    //用户注册
    public int InsertUser(User user){
        int number= loginMapper.InsertUser(user);
        return number;
    }
}
