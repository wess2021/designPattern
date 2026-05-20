package com.Pattern.bridge;

public class Square extends Shape {

  public Square(Color color) {
    super(color);
  }

  @Override
  public void draw() {
    System.out.println("Shape: Square");
    System.out.println("Color: " + color.getColor());
  }
}
