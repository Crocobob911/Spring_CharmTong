package com.example.CharmTong.hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SayHello implements SaySomething{
    
    @Override
    public String getTerm() {

        return "Hello";
    }
}
