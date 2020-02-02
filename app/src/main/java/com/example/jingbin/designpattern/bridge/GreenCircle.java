package com.example.jingbin.designpattern.bridge;

import android.util.Log;

/**
 * Created by jingbin on 2020-02-01.
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e("---", "Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
