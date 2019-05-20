package com.artmil.mygallery.lesson4.task1;

import androidx.annotation.NonNull;

public class Year {
    private String time_of_year;
    private int year;

    @NonNull
    @Override
    public String toString() {
        return "Year{" +
                "time_of_year='" + time_of_year + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
