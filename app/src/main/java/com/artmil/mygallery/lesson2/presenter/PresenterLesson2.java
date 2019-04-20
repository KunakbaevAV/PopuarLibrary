package com.artmil.mygallery.lesson2.presenter;

import com.artmil.mygallery.lesson2.model.Forbs;
import com.artmil.mygallery.lesson2.model.User;
import com.artmil.mygallery.view.MainView;

import java.util.ArrayList;

public class PresenterLesson2 {
    private ArrayList<MyObserver> observers;
    private User user;
    private Forbs forbs;
    private MainView view;

    public PresenterLesson2(MainView view) {
        this.view = view;
        forbs = new Forbs();
        user = new User();
    }

    public void pressSubscribe() {
        forbs.subscribe(user);
        view.setText("Пользователь подписан" + getThreadName());
    }

    public void pressUnsubscribe() {
        forbs.unsubscribe(user);
        view.setText("Пользователь отписан" + getThreadName());
    }

    public void pressSpam() {
        forbs.newMagazin();
        view.setText(user.getText() + getThreadName());
    }

    private String getThreadName() {
        String name = Thread.currentThread().getName();
        return " Текущий поток " + name;
    }
}
