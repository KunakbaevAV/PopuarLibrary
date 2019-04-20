package com.artmil.mygallery.presenter;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.artmil.mygallery.model.Model;
import com.artmil.mygallery.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private static final String TAG = "my_tag";
    private Model model;

    public MainPresenter() {
        model = new Model();
    }

    public void onButtonClick(String text) {
        model.addText(text);
        getViewState().setText(model.getText());
//        Log.i(TAG, "onButtonClick: " + model.getText());
    }
}
