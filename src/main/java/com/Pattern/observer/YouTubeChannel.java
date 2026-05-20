package com.Pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

  private List<Observer> subscribers = new ArrayList<>();

  @Override
  public void subscribe(Observer observer) {
    subscribers.add(observer);
  }

  @Override
  public void unsubscribe(Observer observer) {
    subscribers.remove(observer);
  }

  @Override
  public void notifySubscribers(String videoTitle) {
    for (Observer obs : subscribers) {
      obs.update(videoTitle);
    }
  }

  public void uploadVideo(String title) {
    System.out.println("New video uploaded: " + title);
    notifySubscribers(title);
  }
}
