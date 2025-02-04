package com.crocobob.RestAPI_CharmTong.RestAPI_CharmTong.Contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
