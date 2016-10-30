package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 */

public class DisplayYZ implements IDisplayBehavior {

    @Override
    public void display() {
        Log.e("---", "样子2");
    }
}
