package com.user.demo;

import java.util.Arrays;
import java.util.Collections;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CardHolderApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CardHolderApplication.class);
		//SpringApplication.run(CardHolderApplication.class, args);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        app.run(args);
	}

	@PostConstruct
	public void setupDbWithData(){
		
	}

}
