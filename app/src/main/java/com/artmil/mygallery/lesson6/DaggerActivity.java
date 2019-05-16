package com.artmil.mygallery.lesson6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.lesson6.app.App;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);
        initApp();
    }

    private void initApp() {

        App.getAppComponent().inject(this);

        Red red = new Red(green);
        White white = new White(green);

        red.green.show();
        white.green.show();
    }
}
