package com.example.CharmTong.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SaySomethingApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(SaySomethingConfig.class);

		context.getBean(TalkingMachine.class).Say();
	}
}
