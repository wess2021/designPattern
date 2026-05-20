package com.Pattern.factory;

public class Test {
  public static void main(String[] args) {

    Vehicle v1 = VehicleFactory.createVehicle("CAR");
    Vehicle v2 = VehicleFactory.createVehicle("BIKE");
    Vehicle v3 = VehicleFactory.createVehicle("TRUCK");

    v1.drive();
    v2.drive();
    v3.drive();
  }
}
/*
 * Why Factory Method is powerful ✅ 1. Loose coupling
 * 
 * You don’t depend on concrete classes
 * 
 * ✅ 2. Centralized creation logic
 * 
 * All object creation is in ONE place
 * 
 * ✅ 3. Easy to extend
 * 
 * Add new vehicle → modify only factory
 * 
 * ✅ 4. Cleaner code
 * 
 * No scattered new keywords everywhere
 * 
 * 🌍 10. Real-world use cases ☕ 1. Spring Boot beans (VERY IMPORTANT)
 * ApplicationContext.getBean("service");
 * 
 * 👉 Spring is basically using factory concepts internally
 * 
 * 🌐 2. REST clients
 * 
 * Different clients:
 * 
 * StripeClient PayPalClient CryptoClient
 * 
 * Factory chooses which one to use
 * 
 * 🧾 3. Logging systems LoggerFactory.getLogger(Class)
 * 
 * 👉 THIS is Factory Method in real life
 * 
 * 🎮 4. Games
 * 
 * Create enemies:
 * 
 * Zombie Alien Boss
 * 
 * Factory decides spawn type
 * 
 * 🧠 11. When should YOU use Factory Method?
 * 
 * Use it when:
 * 
 * ✔ You don’t know exact object type in advance ✔ You want centralized object creation ✔ You want
 * to hide creation logic ✔ You want to follow Open/Closed Principle
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ only one simple object exists ❌ no variation needed ❌ unnecessary abstraction
 */
