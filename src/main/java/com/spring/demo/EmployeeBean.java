package com.spring.demo;

public class EmployeeBean {
	private String fullName;
	
	private DepartmentBean departmentbean;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepartmentBean getDepartmentbean() {
		return departmentbean;
	}

	public void setDepartmentbean(DepartmentBean departmentbean) {
		this.departmentbean = departmentbean;
	}

}
