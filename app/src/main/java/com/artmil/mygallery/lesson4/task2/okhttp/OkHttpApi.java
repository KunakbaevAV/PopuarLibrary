package com.artmil.mygallery.lesson4.task2.okhttp;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class OkHttpApi {

    Single<String> requestServer() {
        return Single.create((SingleOnSubscribe<String>) emitter -> {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.github.com/users/JakeWharton")
                    .build();
            Response response = client.newCall(request).execute();
            assert response.body() != null;
            String data = response.body().string();

            emitter.onSuccess(data);
        }).subscribeOn(Schedulers.io());
    }
}
