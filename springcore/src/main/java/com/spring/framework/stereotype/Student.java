package com.spring.framework.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value = "1")
	private int id;
	
	@Value(value = "Rahul Chauhan")
	private String name;
	
	@Autowired
	private Address address;
	
	@Value("#{temp}")
	private List<String> courses;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String name, Address address, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}


	

}
