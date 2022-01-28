package com.spring.framework.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PreDestroy;

public class Student{

	private int id;
	private String name;
	private List<String> address = new ArrayList<>();
	private Set<String> phones = new HashSet<>();
	private Map<String, String> courses = new HashMap<>();

	private Department department;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, List<String> address, Set<String> phones, Map<String, String> courses,
			Department department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.courses = courses;
		this.department = department;
		System.out.println("Constructor of Student");

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

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phones=" + phones + ", courses="
				+ courses + ", department=" + department + "]";
	}
	
	public void init(){

		System.out.println("Init of Student");
		
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destroy of Student");
	}
	

}
