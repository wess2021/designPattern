package com.Pattern.factory;

public class VehicleFactory {

  public static Vehicle createVehicle(String type) {

    if (type == null) {
      return null;
    }

    if (type.equalsIgnoreCase("CAR")) {
      return new Car();
    }

    if (type.equalsIgnoreCase("BIKE")) {
      return new Bike();
    }

    if (type.equalsIgnoreCase("TRUCK")) {
      return new Truck();
    }

    throw new IllegalArgumentException("Unknown vehicle type: " + type);
  }
}
