package com.artmil.mygallery.lesson4.task1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class GsonPresenter {
    private Gson gson;

    GsonPresenter() {
        GsonBuilder builder = new GsonBuilder();
        gson = builder.create();
    }

    Year parseJson(String jsonText) {
        return gson.fromJson(jsonText, Year.class);
    }

}
