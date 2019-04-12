package com.example.demo.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: RibbonDemoService
 * @Author: ren
 * @DESCRIPTION: 2019/4/2 0002 下午 4:32
 **/
@FeignClient("nocas-ribbon-client")
public interface RibbonDemoService {

    @GetMapping("test")
    String test();
}
