package com.jp.design.patterns.creational.factory;

public class Truck implements Vehicle {

	private int speed=10;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Truck [speed=" + speed + "]";
	}
	
}
