package com.Pattern.facade;

public class EmailService {

  public void sendConfirmation(String product) {
    System.out.println("Email sent for order: " + product);
  }
}
