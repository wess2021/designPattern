package com.Pattern.AbstractFactory;

public class FabriqueElectricite implements VehicleFactory {

  @Override
  public Automobile creeAutomobile(String couleur, String puissance, String modele) {
    AutomobileElectricite auto = new AutomobileElectricite();
    auto.setCouleur(couleur);
    auto.setPuissance(puissance);
    auto.setModele(modele);
    return auto;
  }

  @Override
  public Scooter creeScooter(String couleur, String puissance, String modele) {
    ScooterElectricity scooter = new ScooterElectricity();
    scooter.setCouleur(couleur);
    scooter.setPuissance(puissance);
    scooter.setModele(modele);
    return scooter;
  }
}
