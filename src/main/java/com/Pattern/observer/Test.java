package com.Pattern.observer;

public class Test {
  public static void main(String[] args) {

    YouTubeChannel channel = new YouTubeChannel();

    Observer user1 = new EmailSubscriber("Oussama");
    Observer user2 = new MobileSubscriber("Ahmed");

    channel.subscribe(user1);
    channel.subscribe(user2);

    channel.uploadVideo("Observer Pattern in Java 🚀");

    System.out.println("-----");

    channel.unsubscribe(user1);

    channel.uploadVideo("Second video 🔥");
  }
}
/*
 * What is happening? Step-by-step: Users subscribe to channel Channel stores them in a list
 * 
 * When video is uploaded:
 * 
 * notifySubscribers() All observers automatically get updated ⚡ 10. Why we use Observer Pattern ✅
 * 1. Loose coupling
 * 
 * Subject doesn’t know details of observers
 * 
 * ✅ 2. Easy to extend
 * 
 * Add new notification type:
 * 
 * WhatsAppSubscriber → NO change in YouTubeChannel ✅ 3. Real-time updates
 * 
 * Instant notification system
 * 
 * ✅ 4. Open/Closed Principle
 * 
 * Add new observers without modifying core logic
 * 
 * 🌍 11. Real-world use cases 📺 1. YouTube / Instagram / TikTok subscribers notified when content
 * is posted 📩 2. Email systems marketing emails notifications 📊 3. Stock market apps price change
 * → notify traders 🧾 4. Spring Boot (VERY IMPORTANT) Spring Event system = Observer pattern
 * ApplicationEventPublisher Example: publisher.publishEvent(new UserCreatedEvent());
 * 
 * Listeners:
 * 
 * @EventListener public void handle(UserCreatedEvent event)
 * 
 * 👉 This is Observer pattern in real production systems
 * 
 * 🎮 5. Games player health changes → UI updates enemy spawn → notify AI system 🧠 12. When should
 * YOU use Observer pattern?
 * 
 * Use it when:
 * 
 * ✔ One object changes state ✔ Many other objects must react ✔ You don’t want tight coupling ✔ You
 * want event-driven architecture
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ only one dependent exists ❌ simple logic (no need complexity) ❌ performance is critical (too
 * many listeners)
 */
