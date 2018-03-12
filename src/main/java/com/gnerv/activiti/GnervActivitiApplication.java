package com.gnerv.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.activiti","com.gnerv"})
public class GnervActivitiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GnervActivitiApplication.class, args);
	}
}
