package com.jarvis.sysmgmt.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.sysmgmt.service.impl.JmxServiceImpl;

@RestController
public class TestController {

    @Value("${application.message:Hello World}")
    private String hello;
    
    @Autowired
    private JmxServiceImpl service;

    @RequestMapping(value = "/jmx", method = RequestMethod.GET)
    public String getJmx() {
        service.getAllActiveTasks();
        return hello;
    }
}
