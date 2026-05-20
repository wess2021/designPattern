package com.Pattern.adapter;

// Imagine this is an OLD external API
public class LegacyPaymentService {

  public void makePayment(int amountInCents) {
    System.out.println("Payment done via legacy system: " + amountInCents + " cents");
  }
}
