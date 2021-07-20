package com.jp.design.patterns.behavioral.observer;

public interface IObservable {

	void registerObserver(IObserver iObserver);

	void removeObserver(IObserver iObserver);

	void hireEmployee(Employee employee);

	void modifyEmployeeName(Integer id, String name);
	
	void notifyObservers();

}
