package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.scope.singleton;

@SpringBootApplication
public class ScopebeansApplication {

	public static void main(String[] args) {
		ApplicationContext a= SpringApplication.run(ScopebeansApplication.class, args);
		singleton s=a.getBean(singleton.class);
		
	}

}
