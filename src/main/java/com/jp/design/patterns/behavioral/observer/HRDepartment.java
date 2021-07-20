package com.jp.design.patterns.behavioral.observer;

public class HRDepartment implements IObserver{

	@Override
	public void callMe(Employee employee, String message) {
		System.out.println("HR department notified..");
		System.out.println(message+" "+employee.getName());
	}

}
