package com.artmil.mygallery.lesson3.presenter;

import com.artmil.mygallery.view.MainView;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class PresenterLesson3Task2 {
    private MainView view;
    private Single<String> single;

    public PresenterLesson3Task2(MainView view) {
        this.view = view;
        MessagePresenter messagePresenter = new MessagePresenter();
        single = messagePresenter.singleMessage();
    }

    public void subscribe() {
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                string -> view.setText(string),
                throwable -> view.setText("Error"));
    }

}
