package com.spring.framework.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Config-BeanScope.xml");

		Student student1 = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1.equals(student2));

	}

}
