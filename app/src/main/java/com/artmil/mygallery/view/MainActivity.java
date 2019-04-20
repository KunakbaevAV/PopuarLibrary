package com.artmil.mygallery.view;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.presenter.MainPresenter;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements MainView {

    private static final String TAG = "my_tag";
    private TextView outputText;
    private TextInputEditText inputText;

    public MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initIU();
    }

    private void initIU() {
        MaterialButton button = findViewById(R.id.button_input);
        button.setOnClickListener(this::buttonClick);
        outputText = findViewById(R.id.text_output);
        inputText = findViewById(R.id.text_input);
        presenter = new MainPresenter(this);
    }

    public void buttonClick(View view) {
        presenter.onButtonClick();
    }

    @Override
    public void setText(String text) {
        Log.i(TAG, "setText: " + text);
//        outputText.append(text + "\n");
    }
}
