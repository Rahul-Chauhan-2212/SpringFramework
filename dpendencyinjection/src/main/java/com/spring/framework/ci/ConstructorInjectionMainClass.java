package com.spring.framework.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-CI.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
	}

}
