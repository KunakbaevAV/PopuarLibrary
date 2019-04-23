package com.artmil.mygallery.lesson3.view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;
import com.artmil.mygallery.lesson3.presenter.PresenterLesson3Task1;
import com.artmil.mygallery.view.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityLesson3Task1 extends AppCompatActivity implements MainView {
//    @BindView(R.id.button_subscribe_3)
//    Button buttonSubscribe;
//
//    @BindView(R.id.button_unsubscribe_3)
//    Button buttonUnsubscribe;

    @BindView(R.id.text_output_3)
    TextView textOutput;

    PresenterLesson3Task1 presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3_task1);
        presenter = new PresenterLesson3Task1(this);
        ButterKnife.bind(this);
    }

    @Override
    public void setText(String text) {
        textOutput.append("\n" + text);
    }

    @OnClick(R.id.button_subscribe_3)
    void subscribe() {
        presenter.subscribe();
    }

    @OnClick(R.id.button_unsubscribe_3)
    void unsubscribe() {
        presenter.unsubscribe();
    }


}
