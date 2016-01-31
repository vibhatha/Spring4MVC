package com.goodvideotutorials.spring;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class GoodvideotutorialsSpringApplication {

	private static final Logger logger = LoggerFactory.getLogger(GoodvideotutorialsSpringApplication.class);
	
	public static void main(String[] args) {
		//SpringApplication.run(GoodvideotutorialsSpringApplication.class, args);
		
		//code segment after debugging the applications
		
		ApplicationContext ctx = SpringApplication.run(GoodvideotutorialsSpringApplication.class, args);
		
		logger.info("Bean in application context...");
		
		String beanNames [] = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		
		for(String beanName : beanNames){
			
			logger.info(beanName); 
		}
	}
}
