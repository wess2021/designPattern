package com.Pattern.state;

public class Test {
  public static void main(String[] args) {

    TVContext tv = new TVContext();

    tv.pressPower(); // OFF → ON
    tv.pressMute(); // ON → MUTE
    tv.pressMute(); // MUTE → ON
    tv.pressPower(); // ON → OFF
  }
}
/*
 * Let’s build a concrete real-life example: a TV remote system.
 * 
 * A TV can be in different states:
 * 
 * 🔴 OFF 🟢 ON 🔇 MUTE
 * 
 * And the behavior of the same button changes depending on the state.
 * 
 * That’s exactly what the State pattern is for.
 */
/*
 * 1. Game character states Idle Running Jumping Dead
 * 
 * 👉 Example:
 * 
 * new Character(new RunningState()) 📦 2. Order system (E-commerce)
 * 
 * Order states:
 * 
 * New Paid Shipped Delivered Cancelled
 * 
 * Each state changes behavior:
 * 
 * Can you cancel? Can you refund? Can you ship? 🚦 3. Traffic light system Red → Stop Yellow → Slow
 * Green → Go
 * 
 * Automatic transitions = perfect State pattern case
 * 
 * 📥 4. Document workflow Draft Review Approved Rejected
 * 
 * Each state allows different actions
 * 
 * 💳 5. Bank account Active Frozen Closed
 * 
 * Each state restricts operations
 * 
 * ⚡ 8. When YOU should use State pattern
 * 
 * Use it when:
 * 
 * ✔ Object behavior changes based on internal state ✔ You have many if/else based on state ✔ States
 * have transitions between them ✔ You want to avoid “God class”
 * 
 * 💡 9. One-line memory trick
 * 
 * 👉 State pattern = “same object, different behavior depending on its state class”
 */
