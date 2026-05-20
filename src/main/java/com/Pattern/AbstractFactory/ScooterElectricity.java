package com.Pattern.AbstractFactory;

public class ScooterElectricity extends Scooter {

  @Override
  public void featuresDisplay() {
    System.out.println("Scooter électrique : " + couleur + " - " + puissance + " - " + modele);
  }

}
