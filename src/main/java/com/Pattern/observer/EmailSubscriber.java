package com.Pattern.observer;

public class EmailSubscriber implements Observer {

  private String name;

  public EmailSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update(String videoTitle) {
    System.out.println(name + " received EMAIL: New video -> " + videoTitle);
  }
}
