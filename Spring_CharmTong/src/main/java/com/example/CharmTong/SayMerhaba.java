package com.example.CharmTong;

import org.springframework.stereotype.Component;

@Component
public class SayMerhaba implements SaySomething {

    @Override
    public String getTerm() {
        return "Merhaba";
    }
}
