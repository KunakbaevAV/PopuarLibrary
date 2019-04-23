package com.artmil.mygallery.lesson3.presenter;

import com.artmil.mygallery.view.MainView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class PresenterLesson3Task1 {
    private MainView view;
    private Observable<String> observable;
    private Disposable disposable;

    public PresenterLesson3Task1(MainView view) {
        this.view = view;
        MessagePresenter messagePresenter = new MessagePresenter();
        observable = messagePresenter.getMessage();
    }

    public void subscribe() {
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(
                string -> view.setText(string),
                throwable -> view.setText("Error"),
                () -> view.setText("onComplete"));
    }

    public void unsubscribe() {
        disposable.dispose();
        view.setText("Вы отписаны");
    }

}
