package com.crocobob.RestAPI_CharmTong.RestAPI_CharmTong.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome. This is home.";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
