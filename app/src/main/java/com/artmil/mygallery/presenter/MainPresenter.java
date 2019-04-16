package com.artmil.mygallery.presenter;

import com.artmil.mygallery.model.Model;
import com.artmil.mygallery.view.MainView;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }

    public void onButtonClick(String text) {
        model.addText(text);
        mainView.setText(model.getText());
    }
}
