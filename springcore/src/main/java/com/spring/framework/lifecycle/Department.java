package com.spring.framework.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Department implements InitializingBean,DisposableBean{
	
	private int departmentId;
	private String departmentName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	
	@Override
	public void destroy() throws Exception {

		System.out.print("Destroy of Department");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.print("Init of Department");
		
	}
	

}
