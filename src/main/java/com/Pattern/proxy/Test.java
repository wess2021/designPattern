package com.Pattern.proxy;

public class Test {
  public static void main(String[] args) {

    Image image = new ProxyImage("photo.jpg");

    System.out.println("Image created, but NOT loaded yet");

    // first call → loads image
    image.display();

    System.out.println("-----");

    // second call → already loaded
    image.display();
  }
}
/*
 * What is happening? Step-by-step: 1. You create proxy: ProxyImage created → NO real image loaded
 * 2. First access: RealImage created → loads from disk 3. Second access: Already loaded → reuse
 * object ⚡ 9. Why Proxy Pattern is powerful ✅ 1. Lazy loading
 * 
 * Create object ONLY when needed
 * 
 * ✅ 2. Security control
 * 
 * You can block access:
 * 
 * if (!user.isAdmin()) { throw new AccessDenied(); } ✅ 3. Caching
 * 
 * Avoid repeated expensive operations
 * 
 * ✅ 4. Logging / monitoring
 * 
 * Track access to real object
 * 
 * ✅ 5. Performance optimization 🌍 10. Real-world usage (VERY IMPORTANT) 🧠 1. Hibernate (VERY
 * IMPORTANT)
 * 
 * 👉 Lazy loading is Proxy pattern
 * 
 * User user = session.get(User.class, 1);
 * 
 * But:
 * 
 * user.getOrders()
 * 
 * 👉 Orders are loaded via proxy only when needed
 * 
 * 🔐 2. Spring Security
 * 
 * Spring creates proxies around your beans:
 * 
 * @PreAuthorize("hasRole('ADMIN')")
 * 
 * 👉 Proxy checks permission BEFORE method runs
 * 
 * 📦 3. Spring AOP (Aspect Oriented Programming)
 * 
 * Logging, transactions:
 * 
 * @Transactional
 * 
 * 👉 Proxy wraps method and adds behavior
 * 
 * 🌐 4. Remote services
 * 
 * Proxy hides network calls:
 * 
 * API gateway microservices communication 💾 5. Caching systems Redis proxy in-memory cache proxy
 * 🧠 11. Types of Proxy (important theory) 1. Virtual Proxy (lazy loading)
 * 
 * 👉 like image example
 * 
 * 2. Protection Proxy
 * 
 * 👉 access control (security)
 * 
 * 3. Remote Proxy
 * 
 * 👉 hides remote API calls
 * 
 * 4. Cache Proxy
 * 
 * 👉 stores results
 * 
 * 🧠 12. When should YOU use Proxy?
 * 
 * Use it when:
 * 
 * ✔ Object is expensive to create ✔ You want lazy loading ✔ You need access control ✔ You want
 * logging or monitoring ✔ You want caching
 * 
 * ❌ When NOT to use Proxy
 * 
 * Avoid when:
 * 
 * ❌ object is simple ❌ no performance/security need ❌ unnecessary complexity
 */
