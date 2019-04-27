package com.artmil.mygallery.lesson4.task2;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("users/JakeWharton")
    Observable<String> getUser();
}
