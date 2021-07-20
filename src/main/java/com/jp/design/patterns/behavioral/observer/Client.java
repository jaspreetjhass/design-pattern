package com.jp.design.patterns.behavioral.observer;

import java.util.Date;

public class Client {

	public static void main(final String[] args) {

		//object whose state needs to be monitored
		final IObservable iObservable = new EmployeeManagement();
		
		//create observer who want to be notified
		final IObserver hrObserver = new HRDepartment();
		final IObserver payrollObserver = new PayrollDepartment();

		iObservable.registerObserver(payrollObserver);
		iObservable.registerObserver(hrObserver);

		Employee employee = new Employee(10, "Robbinson", 45, new Date());
		iObservable.hireEmployee(employee);
		
		
	}
	
}
