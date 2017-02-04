package com.jarvis.sysmgmt.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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
