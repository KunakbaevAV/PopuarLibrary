package com.artmil.mygallery.lesson2.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.lesson2.presenter.PresenterLesson2_2;
import com.artmil.mygallery.view.MainView;

public class ActivityLesson2_2 extends AppCompatActivity implements MainView {
    Button buttonSubcribe;
    Button buttonUnsubcribe;
    Button buttonSpam;
    TextView textLogs;
    PresenterLesson2_2 presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_2);
        initUI();
    }

    private void initUI() {
        presenter = new PresenterLesson2_2(this);

        buttonSubcribe = findViewById(R.id.button_subscribe);
        buttonSubcribe.setOnClickListener(v -> presenter.pressSubscribe());

        buttonUnsubcribe = findViewById(R.id.button_unsubscribe);
        buttonUnsubcribe.setOnClickListener(v -> presenter.pressUnsubscribe());

        buttonSpam = findViewById(R.id.button_spam);
        buttonSpam.setOnClickListener(v -> presenter.pressSpam());

        textLogs = findViewById(R.id.textView_logs);
    }

    @Override
    public void setText(String text) {
        textLogs.append("\n" + text);
    }
}
