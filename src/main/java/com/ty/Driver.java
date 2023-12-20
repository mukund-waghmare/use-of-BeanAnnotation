package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
		Student student=(Student)context.getBean("stu");
		
		student.getStudent();
		
	}
	
	
}
