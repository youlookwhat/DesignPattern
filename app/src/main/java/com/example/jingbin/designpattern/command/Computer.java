package com.example.jingbin.designpattern.command;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/31.
 * 电脑
 */

public class Computer {

    public void on() {
        Log.e("Computer:", "---打开电脑");
    }

    public void off() {
        Log.e("Computer:", "---关闭电脑");
    }

}
