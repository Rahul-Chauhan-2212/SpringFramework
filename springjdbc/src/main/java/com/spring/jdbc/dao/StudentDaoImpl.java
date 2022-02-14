package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertRecord(Student student) {
		String query = "insert into student(id,name,age)values(?,?,?)";
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getAge());
	}

	@Override
	public int updateRecord(Student student) {
		String query = "update student set name=?, age=? where id =?";
		return jdbcTemplate.update(query, student.getName(), student.getAge(), student.getId());
	}

	@Override
	public int deleteRecord(Student student) {
		String query = "delete from student where id =?";
		return jdbcTemplate.update(query, student.getId());
	}

}
