package com.Pattern.bridge;

public class Circle extends Shape {

  public Circle(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Shape: Circle");
    System.out.println("Color: " + color.getColor());
  }
}
