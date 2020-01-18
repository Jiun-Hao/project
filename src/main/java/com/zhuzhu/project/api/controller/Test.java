package com.zhuzhu.project.api.controller;

import com.zhuzhu.project.api.model.User;
import com.zhuzhu.project.api.service.impl.UserLogInServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class Test {
    @Resource
    private UserLogInServiceImpl userLogInService;

    @RequestMapping("/login")
    public String test(){
        return "redirect:/login/login.html";
    }

    @PostMapping("/login")
    public String login(User user, HttpServletRequest request){
        request.setAttribute("userSerialId",user.getUserSerialId());
        if(userLogInService.login(user)){
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "main";
        }
        request.setAttribute("LoginRes", "账号或密码错误");
        return "login";
    }
    @RequestMapping("/demo")
    public String demo(){
        return "login";
    }
}
