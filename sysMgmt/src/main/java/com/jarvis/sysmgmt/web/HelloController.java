package com.jarvis.sysmgmt.web;


import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @Value("${application.message:Hello World}")
    private String hello;

    @RequestMapping("/helloJsp")
    public String helloJsp(Map<String, Object> map) {

        System.out.println("HelloController.helloJsp().hello=" + hello);

        map.put("hello", hello);

        return "/hello/helloJsp";

    }
}
