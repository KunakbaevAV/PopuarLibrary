package com.artmil.mygallery.lesson6.app;

import com.artmil.mygallery.lesson6.DaggerActivity;
import com.artmil.mygallery.lesson6.Red;
import com.artmil.mygallery.lesson6.White;

public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(Red red);

    void inject(White white);
}
