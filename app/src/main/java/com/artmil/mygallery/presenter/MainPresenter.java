package com.artmil.mygallery.presenter;


import com.artmil.mygallery.model.Model;
import com.artmil.mygallery.view.MainView;

import java.util.concurrent.TimeUnit;

public class MainPresenter {

    private static final String TAG = "my_tag";
    //    private Model model;
    private MainView view;

    public MainPresenter(MainView view) {
//        model = new Model();
        this.view = view;
    }

    public void onButtonClick() {
        new MyAsyncTask(view).execute();
    }

    public void operation() {


    }

}
