package com.spring.jdbc.dao;

import com.spring.jdbc.entity.Student;

public interface StudentDao {

	public int insertRecord(Student student);

	public int updateRecord(Student student);

	public int deleteRecord(Student student);

}
