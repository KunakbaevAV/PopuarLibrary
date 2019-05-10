package com.artmil.mygallery.lesson4.task2.http;

import android.util.Log;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class HttpPresenter {
    private final String TAG = "retrofit";

    private HTTPApi httpApi;

    public HttpPresenter() {
        httpApi = new HTTPApi();
    }

    public void getString() {
        Single<String> single = httpApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                string -> Log.i(TAG, "getString: " + string),
                throwable -> Log.i(TAG, "error")
        );
    }
}
