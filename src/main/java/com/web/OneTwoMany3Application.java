package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
public class OneTwoMany3Application {

	public static void main(String[] args) {
		SpringApplication.run(OneTwoMany3Application.class, args);
	}

}
