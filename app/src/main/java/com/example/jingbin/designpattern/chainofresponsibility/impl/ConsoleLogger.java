package com.example.jingbin.designpattern.chainofresponsibility.impl;

import android.util.Log;

import com.example.jingbin.designpattern.chainofresponsibility.AbstractLogger;

/**
 * Created by jingbin on 2020-02-03.
 * 2. 创建扩展了该记录器类的实体类。
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        Log.e("---", "Standard Console::Logger  " + message);
    }
}
