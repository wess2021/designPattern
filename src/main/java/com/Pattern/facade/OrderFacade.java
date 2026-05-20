package com.Pattern.facade;

public class OrderFacade {

  private InventoryService inventory = new InventoryService();
  private PaymentService payment = new PaymentService();
  private ShippingService shipping = new ShippingService();
  private EmailService email = new EmailService();

  public void placeOrder(String product, double price) {

    System.out.println("=== ORDER STARTED ===");

    inventory.checkStock(product);
    payment.pay(price);
    shipping.ship(product);
    email.sendConfirmation(product);

    System.out.println("=== ORDER COMPLETED ===");
  }
}
