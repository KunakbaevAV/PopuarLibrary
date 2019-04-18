package com.artmil.mygallery.presenter;

import com.arellomobile.mvp.MvpPresenter;
import com.artmil.mygallery.model.Model;
import com.artmil.mygallery.view.MainView;

public class MainPresenter extends MvpPresenter<MainView> {

    private Model model;

    public MainPresenter() {
        model = new Model();
    }

    public void onButtonClick(String text) {
        model.addText(text);
        getViewState().setText(model.getText());
    }
}
