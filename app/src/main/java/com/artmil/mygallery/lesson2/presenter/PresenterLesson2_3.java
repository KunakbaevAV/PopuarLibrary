package com.artmil.mygallery.lesson2.presenter;


import android.util.Log;

import com.artmil.mygallery.view.MainView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class PresenterLesson2_3 {

    private final String TAG = "my_tag";
    private MainView view;
    private Observable<String> observable;
    private Disposable disposable;

    public PresenterLesson2_3(MainView view) {
        this.view = view;
        TeaPresenter teaPresenter = new TeaPresenter();
        observable = teaPresenter.getCup();
    }

    public void subscribe() {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG, "onSubscribe: ");
                PresenterLesson2_3.this.disposable = disposable; //Непонятно, для чего это?
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG, "onNext: " + Thread.currentThread().getName() + ": " + s);
                view.setText(Thread.currentThread().getName() + ": " + s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "onError: " + e);
            }

            @Override
            public void onComplete() {
                Log.i(TAG, "onComplete: ");
            }
        });
        Log.i(TAG, "subscribe: end " + Thread.currentThread().getName());
    }

    public void unsubscribe() {
        view.setText("Ошибка");
//        disposable.dispose(); //Тут выдает ошибку и вылетает
    }
}
