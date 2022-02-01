package com.spring.framework.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SettlerInjectionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-SI.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
	}

}