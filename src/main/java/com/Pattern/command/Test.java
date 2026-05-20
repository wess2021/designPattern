package com.Pattern.command;

public class Test {
  public static void main(String[] args) {

    TV tv = new TV();

    Command on = new TurnOnCommand(tv);
    Command off = new TurnOffCommand(tv);
    Command volumeUp = new VolumeUpCommand(tv);

    RemoteControl remote = new RemoteControl();

    remote.setCommand(on);
    remote.pressButton();

    remote.setCommand(volumeUp);
    remote.pressButton();

    remote.setCommand(off);
    remote.pressButton();
  }
}
/*
 * Instead of calling:
 * 
 * tv.turnOn();
 * 
 * We do:
 * 
 * remote.pressButton() → executes command → calls TV
 * 
 * 👉 We are decoupling sender and receiver
 * 
 * ⚡ 10. Why Command Pattern is powerful ✅ 1. Decoupling
 * 
 * Invoker doesn’t know what it is executing
 * 
 * ✅ 2. Easy to extend
 * 
 * Add new command without changing old code:
 * 
 * MuteCommand RestartCommand RecordCommand ✅ 3. Supports undo/redo (VERY IMPORTANT)
 * 
 * You can store commands:
 * 
 * List<Command> history; ✅ 4. Queue systems
 * 
 * Commands can be executed later
 * 
 * ✅ 5. Logging / audit system
 * 
 * You can log every command
 * 
 * 🌍 11. Real-world usage 🧾 1. Undo/Redo systems (Word, Photoshop)
 * 
 * Every action = command object
 * 
 * 🖥️ 2. GUI buttons
 * 
 * Each button is a command
 * 
 * 🧵 3. Task queues / job schedulers background jobs batch processing 🌐 4. REST APIs (VERY
 * IMPORTANT)
 * 
 * Each request can be treated as command:
 * 
 * CreateUserCommand DeleteOrderCommand 🔄 5. Spring Boot + CQRS architecture
 * 
 * Command side:
 * 
 * CreateOrderCommand
 * 
 * Query side:
 * 
 * GetOrderQuery 🤖 6. Microservices
 * 
 * Commands sent via:
 * 
 * Kafka RabbitMQ 🧠 12. When should YOU use Command Pattern?
 * 
 * Use it when:
 * 
 * ✔ You want to encapsulate requests ✔ You need undo/redo ✔ You want queue execution ✔ You want
 * flexible actions (UI, API, jobs) ✔ You want to decouple sender from receiver
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ simple direct method call is enough ❌ no need for flexibility ❌ overengineering small systems
 */
