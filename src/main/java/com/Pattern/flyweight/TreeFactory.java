package com.Pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

  private static Map<String, TreeType> treeMap = new HashMap<>();

  public static TreeType getTree(String name, String color) {

    String key = name + "-" + color;

    if (!treeMap.containsKey(key)) {
      treeMap.put(key, new TreeType(name, color));
      System.out.println("Creating new TreeType: " + key);
    }

    return treeMap.get(key);
  }
}
