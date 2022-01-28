package com.spring.framework.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StreotypeMainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-Stereotype.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
