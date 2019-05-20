package com.artmil.mygallery.lesson4.task2.http;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

class HTTPApi {
    Single<String> requestServer() {
        return Single.create((SingleOnSubscribe<String>) emitter -> {
            InputStream inputStream;
            String data;

            URL url = new URL("https://api.github.com/users/JakeWharton");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int response = connection.getResponseCode();

            if (response == HttpURLConnection.HTTP_OK) {
                inputStream = connection.getInputStream();
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                int read;
                while ((read = inputStream.read()) != -1) {
                    bos.write(read);
                }
                byte[] result = bos.toByteArray();
                bos.close();
                data = new String(result);
                emitter.onSuccess(data);
            }
        }).subscribeOn(Schedulers.io());
    }
}
