package com.artmil.mygallery.lesson2.presenter;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

class TeaPresenter {
    private final String TAG = "my_tag";

    Observable<String> getCup() {

        Observable<String> observable = Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String cup = "Держи чашку: " + i;
                    Log.d(TAG, "getCupOfTea: " + Thread.currentThread().getName() + ": " + cup);
                    emitter.onNext(cup);
                }
            } catch (InterruptedException e) {
                Log.d(TAG, "getCupOfCoffee: not disposed");
            }
        }).subscribeOn(Schedulers.io());

        return observable;
    }

}
