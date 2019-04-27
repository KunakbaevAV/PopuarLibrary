package com.artmil.mygallery.lesson4.task2;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

class RetrofitApi {

    Observable<String> requestServer() {
        ScalarsConverterFactory converterFactory = ScalarsConverterFactory.create();
//        GsonConverterFactory converterFactory = GsonConverterFactory.create();

        RetrofitService api = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //Чтобы принимать Observable, а не просто String
                .addConverterFactory(converterFactory)
                .build()
                .create(RetrofitService.class);
        return api.getUser().subscribeOn(Schedulers.io());
    }
}
