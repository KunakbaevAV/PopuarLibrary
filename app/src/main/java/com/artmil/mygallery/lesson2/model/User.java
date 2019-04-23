package com.artmil.mygallery.lesson2.model;

import com.artmil.mygallery.lesson2.presenter.MyObserver;

public class User implements MyObserver {
    private String text;

    public User() {
        defaultValue();
    }

    @Override
    public void update(String text) {
        this.text = text;
    }

    @Override
    public void defaultValue() {
        text = "Пользователь не подписан";
    }

    public String getText() {
        return text;
    }
}
