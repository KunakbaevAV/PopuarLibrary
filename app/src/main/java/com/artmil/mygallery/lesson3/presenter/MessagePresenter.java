package com.artmil.mygallery.lesson3.presenter;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

class MessagePresenter {
    Observable<String> getMessage() {

        return Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                for (int i = 1; i < 30; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String cup = "Сообщение № " + i;
                    emitter.onNext(cup);
                }
            } catch (InterruptedException ignored) {
            }
        }).subscribeOn(Schedulers.io());
    }
}
