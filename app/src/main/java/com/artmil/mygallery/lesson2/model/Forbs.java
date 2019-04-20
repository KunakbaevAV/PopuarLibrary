package com.artmil.mygallery.lesson2.model;

import com.artmil.mygallery.lesson2.presenter.MyObserver;
import com.artmil.mygallery.lesson2.presenter.MySubject;

import java.util.ArrayList;

public class Forbs implements MySubject {

    private ArrayList<MyObserver> observers;
    private int number;
    private String name;

    public Forbs() {
        observers = new ArrayList<>();
        number = 0;
        name = "null";
    }

    public void newMagazin() {
        number++;
        name = "Журнал № " + number;
        notifyAllObservers();
    }

    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(MyObserver observer) {
        observer.defaultValue();
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (MyObserver observer : observers) {
            observer.update(name);
        }
    }
}
