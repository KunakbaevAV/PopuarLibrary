package com.artmil.mygallery.view;

//import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;
import com.artmil.mygallery.R;
import com.artmil.mygallery.presenter.MainPresenter;
import com.artmil.mygallery.x_moxy.MvpKtxActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends MvpKtxActivity implements MainView {

    private TextView outputText;
    private TextInputEditText inputText;

    @InjectPresenter
    public MainPresenter mainPresenter;

    @ProvidePresenter
    public MainPresenter providePresenter() {
        return new MainPresenter();
    }

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
        mainPresenter = new MainPresenter();
    }

    public void buttonClick(View view) {
        mainPresenter.onButtonClick(Objects.requireNonNull(inputText.getText()).toString());
    }

    @Override
    public void setText(String text) {
        outputText.setText(text);
    }
}
