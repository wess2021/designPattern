package com.Pattern.AbstractFactory;

public class ScooterEssence extends Scooter {

  @Override
  public void featuresDisplay() {
    System.out.println("Scooter essence : " + couleur + " - " + puissance + " - " + modele);
  }

}
