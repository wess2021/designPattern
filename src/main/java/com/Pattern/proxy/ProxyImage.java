package com.Pattern.proxy;

public class ProxyImage implements Image {

  private RealImage realImage;
  private String filename;

  public ProxyImage(String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {

    // Lazy loading (create only when needed)
    if (realImage == null) {
      realImage = new RealImage(filename);
    }

    realImage.display();
  }
}
