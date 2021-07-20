package com.jp.design.patterns.behavioral.observer;

public class PayrollDepartment implements IObserver {

	@Override
	public void callMe(Employee employee, String message) {
		System.out.println("Payroll department notified..");
		System.out.println(message + " " + employee.getName());
	}

}
