package com.example.jingbin.designpattern.chainofresponsibility.impl;

import android.util.Log;

import com.example.jingbin.designpattern.chainofresponsibility.AbstractLogger;

/**
 * Created by jingbin on 2020-02-03.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        Log.e("---", "Error Console::Logger  " + message);
    }
}
