package com.artmil.mygallery.lesson6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;

public class NoDiActivity extends AppCompatActivity {
    public final static String TAG = "lesson6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);
        initApp();
    }

    private void initApp() {
        Red red = new Red(new Green());
        White white = new White(new Green());

        red.green.show();
        white.green.show();
    }
}
