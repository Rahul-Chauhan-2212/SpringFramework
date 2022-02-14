package com.spring.jdbc;

import java.util.List;

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
		/*
		 * student.setId(3); student.setName("Pooja"); student.setAge(20); int
		 * insertRecord = studentDao.insertRecord(student); System.out.println("Total "
		 * + insertRecord + " records inserted..");
		 */
		/*
		 * student.setId(1); student.setName("Rahul"); student.setAge(26); int
		 * updateRecord = studentDao.updateRecord(student);
		 * System.out.println(updateRecord + " records updated");
		 */
		/*
		 * student.setId(3); int deleteRecord = studentDao.deleteRecord(student);
		 * System.out.println(deleteRecord + " records deleted");
		 */
		/*
		 * student.setId(1); Student singleRecord = studentDao.getSingleRecord(student);
		 * System.out.println("Record selected is -->"+singleRecord);
		 */
		List<Student> allRecords = studentDao.getAllRecords();
		for(Student s:allRecords) {
			System.out.println(s);
		}
		context.close();

	}
}
