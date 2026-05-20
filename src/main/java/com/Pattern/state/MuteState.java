package com.Pattern.state;

public class MuteState implements TVState {

  @Override
  public void pressPower(TVContext context) {
    System.out.println("Turning TV OFF from MUTE");
    context.setState(new OffState());
  }

  @Override
  public void pressMute(TVContext context) {
    System.out.println("Unmuting TV → back to ON");
    context.setState(new OnState());
  }
}
