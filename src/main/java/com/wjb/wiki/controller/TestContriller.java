package com.wjb.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2021/11/30
 */
@RestController
//@Controller    返回一个页面
public class TestContriller {
    @RequestMapping("/say")
    public String say(){
        return "wjb";
    }
}
