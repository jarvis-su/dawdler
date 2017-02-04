package com.jarvis.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @RequestMapping(value = "/jmx", method = RequestMethod.GET)
    @ResponseBody
    public String getJmx(@RequestParam String name) {
        return "Hello " + name;
    }
}
