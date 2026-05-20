package com.Pattern.decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
public void assembly() {
	super.assembly();
	System.out.println("this is a sport car ");
}
}
