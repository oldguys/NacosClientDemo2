package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Author: ren
 * @DESCRIPTION: 2019/4/2 0002 下午 5:10
 **/
@RequestMapping("config")
@RestController
public class ConfigController {

    @Value("${test-prop:996}")
    public String testProp;

    @GetMapping("get")
    public String get(){
        return testProp;
    }
}
