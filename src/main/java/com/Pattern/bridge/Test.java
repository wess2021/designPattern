package com.Pattern.bridge;

public class Test {
  public static void main(String[] args) {

    Shape s1 = new Circle(new Red());
    Shape s2 = new Square(new Blue());

    s1.draw();
    System.out.println("-----");
    s2.draw();
  }
}
/*
 * 🎯 4. Real-world use cases (VERY IMPORTANT) 🖥️ 1. GUI systems (buttons, themes) Button
 * (WindowsButton, MacButton) Theme (DarkTheme, LightTheme) new Button(new DarkTheme()) new
 * Button(new LightTheme()) 📱 2. Mobile apps (Android/iOS + themes) Screen = abstraction Theme =
 * implementation 🖨️ 3. Printer system Document type: PDF, Word, Excel Printer type: Epson, HP,
 * Canon new PdfDocument(new HpPrinter()) 🎮 4. Game development Character type: Warrior, Mage
 * Weapon: Sword, Bow, Magic new Warrior(new Sword()) 🚗 5. Car system Car type: SUV, Sedan Engine:
 * Electric, Diesel new SUV(new ElectricEngine()) 💡 5. When should YOU use Bridge pattern?
 * 
 * Use it when:
 * 
 * ✔ You have 2 dimensions that vary independently ✔ You see many class combinations starting to
 * explode ✔ You want runtime flexibility (not compile-time locking)
 */
