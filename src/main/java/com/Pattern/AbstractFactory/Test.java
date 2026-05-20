package com.Pattern.AbstractFactory;

public class Test {

  public static void main(String[] args) {

    System.out.println("=== FABRIQUE ELECTRIQUE ===");

    VehicleFactory fabriqueElec = new FabriqueElectricite();

    Automobile autoElec = fabriqueElec.creeAutomobile("Bleu", "300CV", "Tesla");

    Scooter scooterElec = fabriqueElec.creeScooter("Noir", "50CV", "Xiaomi");

    autoElec.featuresDisplay();
    scooterElec.featuresDisplay();


    System.out.println("\n=== FABRIQUE ESSENCE ===");

    VehicleFactory fabriqueEssence = new FabriqueEssence();

    Automobile autoEss = fabriqueEssence.creeAutomobile("Rouge", "200CV", "BMW");

    Scooter scooterEss = fabriqueEssence.creeScooter("Blanc", "80CV", "Yamaha");

    autoEss.featuresDisplay();
    scooterEss.featuresDisplay();
  }
}
/*
 * exemple where to use it Dans tes projets Java / backend :
 * 
 * Paiements PaymentFactory -> Paypal -> Card -> Stripe or Notifications NotificationFactory
 * ->Email->SMS -> Push or Génération de rapports ReportFactory -> PDF -> Excel -> CSV
 * 
 * Très utile pour tes dashboards Spring Boot.
 */
