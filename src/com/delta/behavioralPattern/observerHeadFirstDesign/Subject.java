package com.delta.behavioralPattern.observerHeadFirstDesign;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
