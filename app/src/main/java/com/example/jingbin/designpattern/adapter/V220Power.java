package com.example.jingbin.designpattern.adapter;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 * 我们拥有的家用电是220v
 */

public class V220Power {

    public int provideV220Power() {
        Log.e("---", "现有类: 我们提供的是220v的家用电");
        return 220;
    }
}
