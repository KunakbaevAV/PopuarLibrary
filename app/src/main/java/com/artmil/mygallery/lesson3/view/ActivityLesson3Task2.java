package com.artmil.mygallery.lesson3.view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.lesson3.presenter.PresenterLesson3Task2;
import com.artmil.mygallery.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityLesson3Task2 extends AppCompatActivity implements MainView {

    @BindView(R.id.text_output_3)
    TextView textOutput;

    PresenterLesson3Task2 presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_task2);
        presenter = new PresenterLesson3Task2(this);
        ButterKnife.bind(this);
    }

    @Override
    public void setText(String text) {
        textOutput.append("\n" + text);
    }

    @OnClick(R.id.button_get_message)
    void subscribe() {
        presenter.subscribe();
    }

}
