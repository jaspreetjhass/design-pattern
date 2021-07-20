package com.jp.design.patterns.creational.factory;

public enum VehicleType {

	CAR {
		@Override
		Vehicle getVehicle() {
			return new Car();
		}
	},
	TRUCK {
		@Override
		Vehicle getVehicle() {
			return new Truck();
		}
	},
	BUS {
		@Override
		Vehicle getVehicle() {
			return new Bus();
		}
	};

	abstract Vehicle getVehicle();

}
