package com.Pattern.observer;

public class MobileSubscriber implements Observer {

  private String name;

  public MobileSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update(String videoTitle) {
    System.out.println(name + " received PUSH notification: " + videoTitle);
  }
}
