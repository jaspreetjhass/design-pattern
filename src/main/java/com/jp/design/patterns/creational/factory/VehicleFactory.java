package com.jp.design.patterns.creational.factory;

public class VehicleFactory {

	public static Vehicle getVehicleFactory(final VehicleType vehicleType) {
		return vehicleType.getVehicle();
	}

}

class FactoryExecutor {
	public static void main(final String[] args) {
		System.out.println(VehicleFactory.getVehicleFactory(VehicleType.TRUCK));
	}
}
