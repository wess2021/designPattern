package com.Pattern.decorator;

public class CarDecorator implements Car{
	private Car car; //composition
	public CarDecorator(Car car) {
		this.car=car;
	}
public void assembly() {
	this.car.assembly();
}
}
