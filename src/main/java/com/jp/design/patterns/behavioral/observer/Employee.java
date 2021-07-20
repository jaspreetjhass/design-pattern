package com.jp.design.patterns.behavioral.observer;

import java.util.Date;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private Date hireDate;
	
	public Employee(Integer id, String name, Integer age, Date hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hireDate = hireDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

}
