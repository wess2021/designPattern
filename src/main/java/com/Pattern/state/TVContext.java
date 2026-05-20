package com.Pattern.state;

public class TVContext {

  private TVState state;

  public TVContext() {
    this.state = new OffState(); // default state
  }

  public void setState(TVState state) {
    this.state = state;
  }

  public void pressPower() {
    state.pressPower(this);
  }

  public void pressMute() {
    state.pressMute(this);
  }
}
