package com.Pattern.decorator;

public class test {

	public static void main(String[] args) {
	
Car car=new BasicCar();
car.assembly();

Car luxurycar = new LuxuryCar(new BasicCar());

luxurycar.assembly();
	
	
	
	}

}
