package com.application.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.application.springboot.controller","com.application.springboot.service","com.application.springboot.serviceimpl","com.application.springboot.model"})
public class App {
	public static void main(String...  args){
		SpringApplication.run(App.class, args);
	}
}
