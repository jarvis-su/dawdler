package com.jarvis.web;

import com.jarvis.SysMgmtException;
import com.jarvis.SysMgmtRestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/fail")
    public String fail() {
        throw new SysMgmtException("Oh dear!");
    }

    @RequestMapping("/fail2")
    public String fail2() {
        throw new IllegalStateException();
    }

    @ExceptionHandler(SysMgmtException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public
    @ResponseBody
    SysMgmtRestResponse handleMyRuntimeException(SysMgmtException exception) {
        return new SysMgmtRestResponse("Some data I want to send back to the client.");
    }

}
