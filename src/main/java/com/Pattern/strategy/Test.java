package com.Pattern.strategy;

public class Test {
  public static void main(String[] args) {

    PaymentContext context = new PaymentContext();

    // Pay with card
    context.setStrategy(new CreditCardPayment());
    context.executePayment(100);

    // Pay with PayPal
    context.setStrategy(new PayPalPayment());
    context.executePayment(200);

    // Pay with Cash
    context.setStrategy(new CashPayment());
    context.executePayment(300);
  }
}
/*
 * Real-world use cases
 * 
 * Strategy is EVERYWHERE in real systems:
 * 
 * 💳 1. Payment systems (most common) Card PayPal Apple Pay Crypto 📊 2. Sorting algorithms
 * QuickSort MergeSort BubbleSort sorter.setStrategy(new QuickSort()); 🎯 3. Discount system
 * (e-commerce) Student discount Black Friday discount VIP discount 🚗 4. Navigation apps (Google
 * Maps) Fastest route Shortest route Avoid tolls 🧠 5. AI / ML systems different prediction models
 * different scoring algorithms 🧾 6. Spring Boot example (VERY IMPORTANT)
 * 
 * In Spring:
 * 
 * @Service
 * 
 * You often inject different implementations:
 * 
 * @Autowired PaymentStrategy strategy;
 * 
 * 👉 Spring chooses implementation at runtime (Strategy in action)
 * 
 * 🧠 7. When should YOU use Strategy pattern?
 * 
 * Use it when:
 * 
 * ✔ You have multiple algorithms for same task ✔ You see many if/else or switch cases ✔ You want to
 * switch behavior at runtime ✔ You want to add new behavior without modifying old code
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ only one behavior exists ❌ logic is very simple ❌ no variation is needed
 */
