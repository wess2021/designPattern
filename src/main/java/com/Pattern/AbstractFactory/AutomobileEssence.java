package com.Pattern.AbstractFactory;

public class AutomobileEssence extends Automobile {

  @Override
  public void featuresDisplay() {
    System.out.println("Automobile essence : " + couleur + " - " + puissance + " - " + modele);
  }

}
