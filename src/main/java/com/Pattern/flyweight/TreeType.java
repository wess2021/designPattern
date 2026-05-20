package com.Pattern.flyweight;

// intrinsic state (shared)
public class TreeType {

  private String name;
  private String color;

  public TreeType(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public void draw(int x, int y) {
    System.out.println(
        "Drawing " + name + " tree with color " + color + " at position (" + x + "," + y + ")");
  }
}
