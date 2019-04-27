package com.artmil.mygallery.lesson4.task2;

import com.artmil.mygallery.view.MainView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

class RetrofitPresenter {

    private RetrofitApi retrofitApi;
    private final String TAG = "retrofit";
    private MainView view;

    RetrofitPresenter(MainView view) {
        retrofitApi = new RetrofitApi();
        this.view = view;
    }

    void getString() {
        Observable<String> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                str -> view.setText(str),
                throwable -> view.setText("Ошибка")
        );
    }
}
