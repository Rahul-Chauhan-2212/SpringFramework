package com.spring.framework.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireExampleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-Autowire.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
	}

}
