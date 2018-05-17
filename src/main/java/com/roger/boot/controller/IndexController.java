package com.roger.boot.controller;

import com.roger.boot.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class IndexController {

    @Value("${app.name}")
    private String name;

    @Value("${app.page-size}")
    private Integer pageSize;

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/")
    public String index(){
        return "idx";
    }

    @RequestMapping("/out")
    @ResponseBody//ResponseBody注解的目的是将返回对象JSON序列化
    public Date out(Date inputDate){
        return inputDate;
    }
}
