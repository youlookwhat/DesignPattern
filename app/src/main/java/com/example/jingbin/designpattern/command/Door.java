package com.example.jingbin.designpattern.command;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/31.
 * 门
 */

public class Door {

    public void open() {
        Log.e("Door:", "---打开门");
    }

    public void close() {
        Log.e("Door:", "---关闭门");
    }
}
