package com.Pattern.builder;

public class Test {
  public static void main(String[] args) {

    User user =
        User.builder().name("Oussama").age(25).email("oussama@gmail.com").phone("12345678").build();

    user.show();
  }
}
/*
 * What is happening?
 * 
 * Instead of:
 * 
 * constructor chaos ❌
 * 
 * We do:
 * 
 * step-by-step object creation ✅ ⚡ 7. Why Builder Pattern is powerful ✅ 1. Readable code
 * .name("Oussama") .age(25) ✅ 2. Avoids constructor explosion
 * 
 * No need for 10 constructors
 * 
 * ✅ 3. Immutable objects (important)
 * 
 * Object is created once and cannot be changed
 * 
 * ✅ 4. Flexible object creation
 * 
 * You can set only what you need:
 * 
 * User.builder().name("Ali").build(); ✅ 5. Safer code
 * 
 * No wrong parameter order
 * 
 * 🌍 8. Real-world use cases 🧾 1. DTOs in Spring Boot (VERY COMMON)
 * 
 * Example:
 * 
 * UserDTO.builder() .username("admin") .role("ADMIN") .build(); 🌐 2. API request objects filters
 * search queries pagination objects 🏗️ 3. Spring framework internally
 * 
 * Spring uses builder-like patterns in:
 * 
 * RestTemplate WebClient ResponseEntity 🧠 4. Lombok usage (REAL INDUSTRY)
 * 
 * Instead of writing builder manually:
 * 
 * @Builder
 * 
 * 👉 Lombok generates everything automatically
 * 
 * 🎮 5. Game development
 * 
 * Building complex characters:
 * 
 * Character.builder() .weapon("Sword") .armor("Steel") .level(10) 🧠 9. When should YOU use
 * Builder?
 * 
 * Use it when:
 * 
 * ✔ Class has many fields ✔ You want readable object creation ✔ You want immutable objects ✔ You
 * want flexibility in construction
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ object has only 1–2 fields ❌ simple data structures ❌ unnecessary complexity
 */
