package com.spring.framework.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeansMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config-BeanLifeCycle.xml");
		context.registerShutdownHook();
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
	}

}
