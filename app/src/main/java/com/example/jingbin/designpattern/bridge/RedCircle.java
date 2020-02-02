package com.example.jingbin.designpattern.bridge;

import android.util.Log;

/**
 * Created by jingbin on 2020-02-01.
 * 2. 创建实现了 DrawAPI 接口的实体桥接实现类。
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        Log.e("---", "Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", y: " + y + "]");
    }
}
