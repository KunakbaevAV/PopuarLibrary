package com.artmil.mygallery.lesson2.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.lesson2.presenter.PresenterLesson2_3;
import com.artmil.mygallery.view.MainView;

public class ActivityLesson3_3 extends AppCompatActivity implements MainView {
    Button buttonSubcribe;
    Button buttonUnsubcribe;
    TextView textLogs;
    PresenterLesson2_3 presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2_3);
        initUI();
    }

    private void initUI() {
        presenter = new PresenterLesson2_3(this);
        textLogs = findViewById(R.id.textView_logs_rx);

        buttonSubcribe = findViewById(R.id.button_subscribe_rx);
        buttonSubcribe.setOnClickListener(v -> presenter.subscribe());

        buttonUnsubcribe = findViewById(R.id.button_unsubscribe_rx);
        buttonUnsubcribe.setOnClickListener(v -> presenter.unsubscribe());
    }

    @Override
    public void setText(String text) {
        textLogs.append("\n" + text);
    }
}
