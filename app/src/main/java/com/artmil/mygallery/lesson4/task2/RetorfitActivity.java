package com.artmil.mygallery.lesson4.task2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.artmil.mygallery.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RetorfitActivity extends AppCompatActivity {

    @BindView(R.id.textViewLesson4_2)
    TextView textView;

    @BindView(R.id.imageViewLesson4)
    ImageView imageAvatar;

    RetrofitPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_4_2);
        ButterKnife.bind(this);
        presenter = new RetrofitPresenter();
    }

    @OnClick(R.id.buttonLesson4_2)
    void pressButton() {
        String text = presenter.getString();
        textView.setText(text);
    }
}
