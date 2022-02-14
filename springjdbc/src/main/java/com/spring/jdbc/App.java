package com.spring.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDao studentDao = (StudentDaoImpl) context.getBean("studentDao");
		Student student = new Student();
		student.setId(3);
		student.setName("Pooja");
		student.setAge(20);
		int insertRecord = studentDao.insertRecord(student);
		System.out.println("Total " + insertRecord + " records inserted..");
		context.close();

	}
}
