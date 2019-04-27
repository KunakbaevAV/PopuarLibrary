package com.artmil.mygallery.lesson4.task2.okhttp;

import com.artmil.mygallery.view.MainView;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class OkHttpPresenter {
    private OkHttpApi okHttpApi;
    private MainView mainView;

    public OkHttpPresenter(MainView mainView) {
        this.mainView = mainView;
        okHttpApi = new OkHttpApi();
    }

    public void getString() {
        Single<String> single = okHttpApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                s -> mainView.setText(s),
                throwable -> mainView.setText("Ошибка")
        );
    }
}
