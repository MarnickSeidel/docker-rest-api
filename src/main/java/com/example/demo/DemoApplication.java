package com.example.demo;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan
public class DemoApplication {

	public static void main(String[] args) {
		run(DemoApplication.class, args);
	}


}
