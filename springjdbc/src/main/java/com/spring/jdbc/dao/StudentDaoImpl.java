package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

	@Override
	public Student getSingleRecord(Student student) {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student where id =?";
		return jdbcTemplate.queryForObject(query, rowMapper,student.getId());
	}

	@Override
	public List<Student> getAllRecords() {
		String query = "select * from student";
		return jdbcTemplate.query(query, new RowMapperImpl());
	}

}
