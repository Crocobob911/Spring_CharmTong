package com.crocobob.RestAPI_CharmTong.RestAPI_CharmTong.Contoller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String home() {
        return "Welcome. This is home.";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
