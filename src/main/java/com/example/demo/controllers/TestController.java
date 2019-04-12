package com.example.demo.controllers;

import com.example.demo.feigns.RibbonDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: TestController
 * @Author: ren
 * @DESCRIPTION: 2019/4/2 0002 下午 4:31
 **/
@RestController
public class TestController {

    @Autowired
    private RibbonDemoService ribbonDemoService;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("test")
    public String test(HttpSession session) {
        System.out.println(System.currentTimeMillis());
        return appName + ":" + session.getId();
    }

    @GetMapping("feign")
    public String feign() {
        return ribbonDemoService.test();
    }
}
