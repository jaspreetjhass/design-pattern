package com.jp.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement implements IObservable {

	private final List<IObserver> observers;
	private final List<Employee> employees;
	private Employee employee;
	private String message;

	public EmployeeManagement() {
		observers = new ArrayList<>();
		employees = EmployeeDAO.getEmployeeList();
	}

	@Override
	public void hireEmployee(final Employee employee) {
		this.employee = employee;
		this.message = "NEW HIRE";
		employees.add(employee);
		notifyObservers();
	}

	@Override
	public void modifyEmployeeName(final Integer id, final String name) {
		this.message = "MODIFY HIRE";
		boolean notify = false;
		for (final Employee emp : employees) {
			if (emp.getId().equals(id)) {
				this.employee = emp;
				emp.setName(name);
				notify = true;
			}
		}
		if (notify)
			notifyObservers();
	}

	@Override
	public void registerObserver(final IObserver iObserver) {
		observers.add(iObserver);
	}

	@Override
	public void removeObserver(final IObserver iObserver) {
		observers.remove(iObserver);
	}

	@Override
	public void notifyObservers() {
		for (final IObserver iObserver : observers) {
			iObserver.callMe(employee, message);
		}
	}

}
