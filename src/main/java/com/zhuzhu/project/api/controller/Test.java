package com.zhuzhu.project.api.controller;

import com.zhuzhu.project.api.model.User;
import com.zhuzhu.project.api.service.impl.UserLogInServiceImpl;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class Test {
    @Resource
    private UserLogInServiceImpl userLogInService;

    @RequestMapping("/demo")
    public String test(){
        return "demo";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user, HttpServletRequest request){
        System.out.println("id:"+user.getUserSerialId());
        System.out.println("pass:"+user.getUserPassword());
        if(userLogInService.login(user)){
            System.out.println(user.getUserSerialId());
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "true";
        }
        return "false";
    }
}
