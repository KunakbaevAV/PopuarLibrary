package com.artmil.mygallery.presenter;

import android.util.Log;

import com.artmil.mygallery.model.Model;
import com.artmil.mygallery.view.MainView;

public class MainPresenter {

    private static final String TAG = "my_tag";
    private Model model;
    private MainView view;

    public MainPresenter(MainView view) {
        model = new Model();
        this.view = view;
    }

    public void onButtonClick(String text) {
        model.addText(text);
        view.setText(model.getText());
//        Log.i(TAG, "onButtonClick: " + model.getText());
    }
}
