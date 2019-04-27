package com.artmil.mygallery.lesson4.task2;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

class RetrofitPresenter {

    private RetrofitApi retrofitApi;
    private final String TAG = "retrofit";
    private EditableActivity view;

    RetrofitPresenter(EditableActivity view) {
        retrofitApi = new RetrofitApi();
        this.view = view;
    }

    void getString() {
        Observable<RetrofitModel> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                user -> {
                    view.editText(user.getLogin());
                    view.editImage(user.getAvatarURL());
                },
                throwable -> view.editText("Ошибка")
        );
    }
}
