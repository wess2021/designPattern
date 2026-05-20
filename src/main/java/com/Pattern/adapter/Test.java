package com.Pattern.adapter;

public class Test {
  public static void main(String[] args) {

    LegacyPaymentService legacyService = new LegacyPaymentService();

    PaymentProcessor processor = new PaymentAdapter(legacyService);

    processor.pay(50); // user pays 50 units
  }
}
/*
 * Real-world use cases (VERY IMPORTANT) 🌐 1. Payment gateways Your system External pay() Stripe /
 * PayPal / Legacy API 📦 2. Spring Boot integrations JDBC → JPA adapters REST clients wrapping
 * external APIs 🖨️ 3. Printer systems
 * 
 * Old printer:
 * 
 * printOldFormat()
 * 
 * New system:
 * 
 * print()
 * 
 * Adapter connects both.
 * 
 * 📱 4. Mobile apps Android app calling old REST API Adapter normalizes responses 🔌 5.
 * Microservices
 * 
 * Different services speak different formats (JSON, XML)
 * 
 * Adapter converts data formats.
 * 
 * 🧠 11. When should YOU use Adapter?
 * 
 * Use it when:
 * 
 * ✔ You integrate old + new systems ✔ APIs don’t match ✔ You cannot modify external code ✔ You need
 * compatibility between interfaces
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ You control both systems (just fix interface) ❌ No mismatch exists ❌ Overengineering simple
 * calls
 */
