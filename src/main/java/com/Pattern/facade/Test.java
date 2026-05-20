package com.Pattern.facade;

public class Test {
  public static void main(String[] args) {

    OrderFacade order = new OrderFacade();

    order.placeOrder("iPhone 15", 999.99);
  }
}
/*
 * What changed? ❌ Before Facade:
 * 
 * Controller knows everything:
 * 
 * inventory payment shipping email ✅ After Facade:
 * 
 * Controller only knows:
 * 
 * OrderFacade.placeOrder()
 * 
 * 👉 All complexity is hidden
 * 
 * ⚡ 8. Why Facade Pattern is powerful ✅ 1. Simplifies complex systems
 * 
 * One method instead of many services
 * 
 * ✅ 2. Loose coupling
 * 
 * Client doesn’t depend on internal services
 * 
 * ✅ 3. Easier maintenance
 * 
 * Change internal logic without affecting client
 * 
 * ✅ 4. Cleaner architecture
 * 
 * Perfect for layered systems
 * 
 * 🌍 9. Real-world use cases (VERY IMPORTANT) 🛒 1. E-commerce systems order processing facade
 * checkout facade 🏦 2. Banking systems
 * 
 * One call:
 * 
 * transferMoney()
 * 
 * Internally:
 * 
 * check balance validate account process transaction log operation 📱 3. Mobile apps
 * 
 * One API call hides:
 * 
 * authentication caching database analytics ☁️ 4. Spring Boot services (VERY COMMON)
 * 
 * You often create:
 * 
 * @Service public class UserFacade { public void registerUser() { ... } }
 * 
 * 👉 Controller never touches repositories directly
 * 
 * 🎮 5. Game systems
 * 
 * One method:
 * 
 * startGame()
 * 
 * Internally:
 * 
 * load assets initialize player setup map start engine 🧠 10. When should YOU use Facade?
 * 
 * Use it when:
 * 
 * ✔ You have multiple complex subsystems ✔ You want to simplify API for clients ✔ You want clean
 * architecture layers ✔ You want to reduce coupling
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ system is already simple ❌ no multiple dependencies ❌ unnecessary abstraction
 */
