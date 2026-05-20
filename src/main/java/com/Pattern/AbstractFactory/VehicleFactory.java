package com.Pattern.AbstractFactory;

public interface VehicleFactory {
	public Automobile creeAutomobile(String a,String b ,String c);
	public Scooter creeScooter(String a,String b ,String c);

}
