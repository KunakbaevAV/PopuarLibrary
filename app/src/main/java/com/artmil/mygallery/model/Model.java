package com.artmil.mygallery.model;

public class Model {
    private StringBuilder text;

    public Model() {
        text = new StringBuilder();
    }

    public String getText() {
        return text.toString();
    }

    public void addText(String text) {
        this.text.append(text);
    }
}
