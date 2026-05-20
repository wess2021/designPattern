package com.Pattern.state;

public class OffState implements TVState {

  @Override
  public void pressPower(TVContext context) {
    System.out.println("Turning TV ON");
    context.setState(new OnState());
  }

  @Override
  public void pressMute(TVContext context) {
    System.out.println("TV is OFF → nothing happens");
  }
}
