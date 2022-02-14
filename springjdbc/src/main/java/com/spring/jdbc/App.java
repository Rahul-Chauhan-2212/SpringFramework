package com.spring.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTmplt");
		String query = "insert into student(id,name,age)values(?,?,?)";
		int result = jdbcTemplate.update(query, 2, "Kiran", 22);
		System.out.println("Number of results inserted--->" + result);
		context.close();

	}
}
