package com.Pattern.adapter;

public class PaymentAdapter implements PaymentProcessor {

  private LegacyPaymentService legacyService;

  public PaymentAdapter(LegacyPaymentService legacyService) {
    this.legacyService = legacyService;
  }

  @Override
  public void pay(int amount) {
    // convert and adapt interface
    int amountInCents = amount * 100;

    legacyService.makePayment(amountInCents);
  }
}
