package com.example.jingbin.designpattern.app;

import android.app.Application;

/**
 * Created by jingbin on 2016/10/22.
 */

public class PatternApplication extends Application {

    private static PatternApplication patternApplication;

    public static PatternApplication getInstance() {
        return patternApplication;
    }

    @SuppressWarnings({"unused"})
    @Override
    public void onCreate() {
        super.onCreate();
        patternApplication = this;
    }
}
