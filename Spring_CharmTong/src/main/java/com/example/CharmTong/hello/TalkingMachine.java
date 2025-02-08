package com.example.CharmTong.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TalkingMachine {
    private SaySomething saySomething;

    @Autowired
    public TalkingMachine(SaySomething saySth) {
        this.saySomething = saySth;
    }

    public void Say() {
        System.out.println();
    }
}
