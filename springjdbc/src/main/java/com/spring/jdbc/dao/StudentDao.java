package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entity.Student;

public interface StudentDao {

	public int insertRecord(Student student);

	public int updateRecord(Student student);

	public int deleteRecord(Student student);

	public Student getSingleRecord(Student student);

	public List<Student> getAllRecords();

}
