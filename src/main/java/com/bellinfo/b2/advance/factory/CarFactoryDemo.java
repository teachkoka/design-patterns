package com.bellinfo.b2.advance.factory;

public class CarFactoryDemo {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.getCar("bmw");
		car.modals();

	}

}
