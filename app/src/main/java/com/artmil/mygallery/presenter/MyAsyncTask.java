package com.artmil.mygallery.presenter;

import android.os.AsyncTask;

import com.artmil.mygallery.view.MainView;

import java.util.concurrent.TimeUnit;

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
    private MainView view;

    MyAsyncTask(MainView view) {
        this.view = view;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        view.setText("Начало MyAsyncTask");
    }

    @Override
    protected Void doInBackground(Void... voids) {
        try {
            for (int i = 0; i < 20; i++) {
                TimeUnit.SECONDS.sleep(1);
                view.setText("Операция " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        view.setText("MyAsyncTask завершена");
    }
}
