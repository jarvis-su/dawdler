package com.jarvis.sysmgmt.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}

