package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");

		EmployeeBean employee = (EmployeeBean) context.getBean(EmployeeBean.class);
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartmentbean().getName());
	}
}
