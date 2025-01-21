package com.example.CharmTong;

import org.springframework.stereotype.Component;

@Component
public class SayBonjour implements SaySomething {

    @Override
    public String getTerm() {
        return "Bonjour";
    }
}
