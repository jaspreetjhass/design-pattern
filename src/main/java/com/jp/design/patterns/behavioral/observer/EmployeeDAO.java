package com.jp.design.patterns.behavioral.observer;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAO {

	private static List<Employee> employees;

	static {
		employees = new LinkedList<>();
		employees.addAll(Arrays.asList(new Employee(1, "tom", 25, new Date()), new Employee(2, "ravi", 28, new Date()),
				new Employee(3, "bob", 20, new Date()), new Employee(4, "michel", 30, new Date())));
	}

	public static List<Employee> getEmployeeList() {
		return employees;
	}

}
