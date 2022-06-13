package com.user.demo;

import java.util.Collections;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardHolderApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CardHolderApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8084"));
		        app.run(args);
	}

	@PostConstruct
	public void setupDbWithData(){
		
	}

}
