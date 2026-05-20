package com.Pattern.builder;

public class User {

  private String name;
  private int age;
  private String email;
  private String phone;

  // private constructor → only builder can create it
  private User(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
    this.email = builder.email;
    this.phone = builder.phone;
  }

  public void show() {
    System.out.println(name + " | " + age + " | " + email + " | " + phone);
  }

  // 🔥 BUILDER CLASS
  public static class Builder {

    private String name;
    private int age;
    private String email;
    private String phone;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  // entry point
  public static Builder builder() {
    return new Builder();
  }
}
