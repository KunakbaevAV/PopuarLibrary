package com.artmil.mygallery.lesson4.task2;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {

    private RetrofitApi retrofitApi;
    private String text;

    RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public String getString() {
        Observable<String> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                str -> text = str,
                throwable -> text = "onError"
        );
        return text;
    }
}
