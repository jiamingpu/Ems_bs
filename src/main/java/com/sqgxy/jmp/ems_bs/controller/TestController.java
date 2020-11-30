package com.sqgxy.jmp.ems_bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class TestController {
    @RequestMapping("index")
    public String index(){
        return "html/index";
    }
    @RequestMapping("login")
    public String login(){
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
