package com.artmil.mygallery.lesson4.task1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GsonActivity extends AppCompatActivity {

    @BindView(R.id.textLesson4)
    TextView textView;

    GsonPresenter presenter;
    String api = "{\"time_of_year\": \"summer\", \"year\": 2019} ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);
        initUI();
    }

    private void initUI() {
        ButterKnife.bind(this);
        presenter = new GsonPresenter();
        String text = "Имеем API:\n" + api;
        textView.setText(text);
    }

    @OnClick(R.id.buttonLesson4)
    void pressButton() {
        Year year = presenter.parseJson(api);
        String text = "Получаем класс:\n" + year.toString();
        textView.setText(text);
    }
}
