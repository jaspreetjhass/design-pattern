package com.jp.design.patterns.creational.builder;

public class Employee {

	private final String name;
	private final int age;
	private final String department;

	public Employee(final Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.department = builder.department;
	}

	static class Builder {
		private String name;
		private int age;
		private String department;

		public Builder name(final String name) {
			this.name = name;
			return this;
		}

		public Builder age(final int age) {
			this.age = age;
			return this;
		}

		public Builder department(final String department) {
			this.department = department;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	public static Builder builder() {
		return new Builder();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
}

class BuilderExecutor {
	public static void main(final String[] args) {

		final Employee emp1 = Employee.builder().name("jp").age(23).department("hr").build();
		final Employee emp2 = Employee.builder().name("jhass").age(30).department("payrol").build();
		
		
		System.out.println(emp1);
		System.out.println(emp2);

	}
}
