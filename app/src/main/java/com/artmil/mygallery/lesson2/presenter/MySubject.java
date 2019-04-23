package com.artmil.mygallery.lesson2.presenter;

public interface MySubject {
    void subscribe(MyObserver observer);

    void unsubscribe(MyObserver observer);

    void notifyAllObservers();
}
