package com.Pattern.state;

public class OnState implements TVState {

  @Override
  public void pressPower(TVContext context) {
    System.out.println("Turning TV OFF");
    context.setState(new OffState());
  }

  @Override
  public void pressMute(TVContext context) {
    System.out.println("TV is now MUTED");
    context.setState(new MuteState());
  }
}
