package com.artmil.mygallery.lesson6.app;

import android.app.Application;

public class App extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = generateAppComponent();
    }

    private AppComponent generateAppComponent() {
        return DaggerAppComponent //Этот класс не генерируется
                .buider()
                .appModule(new AppModule(this))
                .build();
    }
}
