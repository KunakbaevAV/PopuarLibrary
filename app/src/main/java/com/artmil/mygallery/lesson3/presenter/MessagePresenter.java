package com.artmil.mygallery.lesson3.presenter;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

class MessagePresenter {

    Observable<String> getMessages() {
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

    Single<String> singleMessage() {
        return Single.create((SingleOnSubscribe<String>)
                emitter -> emitter.onSuccess("Сообщение")).subscribeOn(Schedulers.io());
    }
}
