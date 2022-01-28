package com.spring.framework.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	@Autowired
	@Qualifier(value = "address2")
	private Address address;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	
	
	
	

}
