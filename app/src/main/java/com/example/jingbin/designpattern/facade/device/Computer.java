package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 */

public class Computer {

    public void on() {
        Log.e("Computer", "---打开电脑");
    }

    public void off() {
        Log.e("Computer", "---关闭电脑");
    }
}
