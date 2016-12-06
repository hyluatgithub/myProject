package com.rtx.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/6.
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        System.out.printf("hhhh");
        return "index";
    }
}
