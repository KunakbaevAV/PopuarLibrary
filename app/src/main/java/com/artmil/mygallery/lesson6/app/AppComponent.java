package com.artmil.mygallery.lesson6.app;

import com.artmil.mygallery.lesson6.DaggerActivity;
import com.artmil.mygallery.lesson6.Red;
import com.artmil.mygallery.lesson6.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
