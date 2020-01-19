package com.zhuzhu.project.api.controller;

import com.zhuzhu.project.api.service.impl.UserLogInServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

@Controller
@Slf4j
@RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE})
public class StaticController {

    @Resource
    private UserLogInServiceImpl userLogInService;

    @RequestMapping("/login")
    public String test(){
        return "redirect:/login/login.html";
    }
}
