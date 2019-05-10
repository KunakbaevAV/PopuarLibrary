package com.artmil.mygallery.lesson6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);
        initApp();
    }

    private void initApp() {
        Green green = new Green();
        Red red = new Red(green);
        White white = new White(green);

        red.green.show();
        white.green.show();
    }
}
