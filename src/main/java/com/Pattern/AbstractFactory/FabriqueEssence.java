package com.Pattern.AbstractFactory;

public class FabriqueEssence implements VehicleFactory {

  @Override
  public Automobile creeAutomobile(String couleur, String puissance, String modele) {
    AutomobileEssence auto = new AutomobileEssence();
    auto.setCouleur(couleur);
    auto.setPuissance(puissance);
    auto.setModele(modele);
    return auto;
  }

  @Override
  public Scooter creeScooter(String couleur, String puissance, String modele) {
    ScooterEssence scooter = new ScooterEssence();
    scooter.setCouleur(couleur);
    scooter.setPuissance(puissance);
    scooter.setModele(modele);
    return scooter;
  }
}
