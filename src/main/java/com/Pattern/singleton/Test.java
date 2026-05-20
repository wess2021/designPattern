package com.Pattern.singleton;

public class Test {
  public static void main(String[] args) {

    Logger l1 = Logger.getInstance();
    Logger l2 = Logger.getInstance();
    Logger l3 = Logger.getInstance();

    l1.log("First message");
    l2.log("Second message");
    l3.log("Third message");

    System.out.println(l1 == l2); // true
    System.out.println(l2 == l3); // true
  }
}
/*
 * Where Singleton is used in REAL life 🧾 1. Logging system (VERY common)
 * Logger.getInstance().log("User logged in"); ⚙️ 2. Configuration manager database config API keys
 * system settings
 * 
 * 👉 one shared config across app
 * 
 * 🗄️ 3. Database connection pool one shared pool manager avoids creating multiple connections 🧠
 * 4. Spring Framework (IMPORTANT)
 * 
 * In Spring Boot:
 * 
 * @Service
 * 
 * @Repository
 * 
 * 👉 By default = Singleton beans
 * 
 * So when you inject:
 * 
 * @Autowired MyService service;
 * 
 * 👉 Spring gives you ONE shared instance
 * 
 * 🧾 5. Cache manager Redis connection in-memory cache 🎮 6. Game engine systems sound manager
 * input manager resource manager 🧠 8. When to use Singleton
 * 
 * Use it when:
 * 
 * ✔ You need ONE shared instance ✔ You want global access ✔ Object is heavy (DB, config, cache) ✔
 * You want consistency across app
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ you need multiple configurations ❌ testing becomes hard ❌ tight coupling is bad
 * 
 * ⚡ 9. One-line memory trick
 * 
 * 👉 Singleton = “Only ONE instance of a class in the whole application”
 */
