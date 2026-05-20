package com.Pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {

    List<Tree> forest = new ArrayList<>();

    // Same tree type reused many times
    TreeType oak = TreeFactory.getTree("Oak", "Green");
    TreeType pine = TreeFactory.getTree("Pine", "Dark Green");

    forest.add(new Tree(10, 20, oak));
    forest.add(new Tree(15, 25, oak));
    forest.add(new Tree(50, 60, pine));
    forest.add(new Tree(70, 80, pine));
    forest.add(new Tree(100, 120, oak));

    for (Tree t : forest) {
      t.draw();
    }
  }
}
/*
 * Why Flyweight Pattern is powerful ✅ 1. Huge memory savings
 * 
 * Instead of 1M objects → reuse a few
 * 
 * ✅ 2. Better performance
 * 
 * Less garbage collection
 * 
 * ✅ 3. Efficient object sharing
 * 
 * Same data reused across system
 * 
 * ✅ 4. Scalable systems
 * 
 * Perfect for large-scale apps
 * 
 * 🌍 10. Real-world use cases 🎮 1. Game development (MOST COMMON) trees bullets particles enemies
 * 🗺️ 2. Maps (Google Maps style) roads shared across map tiles icons reused 🖥️ 3. UI systems
 * fonts icons themes 🌐 4. Web browsers DOM elements reuse styles shared CSS classes 📊 5. Big data
 * systems shared metadata objects 🧠 11. When should YOU use Flyweight?
 * 
 * Use it when:
 * 
 * ✔ You have millions of similar objects ✔ Many objects share common data ✔ Memory usage is
 * critical ✔ Object creation is expensive
 * 
 * ❌ When NOT to use it
 * 
 * Avoid when:
 * 
 * ❌ small number of objects ❌ objects are already lightweight ❌ complexity is not worth
 * optimization
 */
