package com.jp.design.patterns.creational.factory;

public class Bus implements Vehicle{

	private int speed=20;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bus [speed=" + speed + "]";
	}
	
}
