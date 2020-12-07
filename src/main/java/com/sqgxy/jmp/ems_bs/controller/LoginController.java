package com.sqgxy.jmp.ems_bs.controller;

import com.sqgxy.jmp.ems_bs.entity.User;
import com.sqgxy.jmp.ems_bs.service.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Login")
@SessionAttributes("user")
public class LoginController {
    @Autowired
    LoginServer loginServer;

    @RequestMapping("index")
    public String index(){
        return "html/index";
    }
    //用户登录
    @RequestMapping("login")
    public String login(User user, HttpSession session,RequestMethod post, RequestMethod get){
        String userName=user.getUserName();
        System.out.println(userName);
        String userPassword=user.getUserPassword();
        System.out.println(userPassword);
        user=loginServer.UserLogin(userName,userPassword);
        System.out.println(user);
        if(user!=null){
            System.out.println("4");
            session.setAttribute("user",user);
            session.setAttribute("userName",userName);
            return "html/index";
        }else{
            return "login/login";
        }

    }
    /* 用户页面登录控制 */
    @RequestMapping("/users")
    public String users() {
        return "login/login";
    }
    @RequestMapping("registered")
    public String registered(){
        return "login/registered";
    }
    @RequestMapping("test")
    public String test(){
        return "html/test";
    }
}
