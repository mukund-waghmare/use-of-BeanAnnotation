package com.ty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.ty")
public class Config {
	
	@Bean(value = "stu")
	public Student getStudent()
	{
		return new Student();
	}
	

}
