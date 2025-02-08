package com.crocobob.RestAPI_CharmTong.RestAPI_CharmTong.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {
    @RequestMapping("/login")
    public String gotoLoginPage() {
        return "login";
    }
}
