package com.Pattern.AbstractFactory;

public class AutomobileElectricite extends Automobile {

  @Override
  public void featuresDisplay() {
    System.out.println("Automobile électrique : " + couleur + " - " + puissance + " - " + modele);
  }

}
