package com.saki.HelloWorldRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestApplication.class, args);

	}

}