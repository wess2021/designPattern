package com.Pattern.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void assembly() {
		super.assembly();
		System.out.println(" this is a luxurry car \n");
	}

}
