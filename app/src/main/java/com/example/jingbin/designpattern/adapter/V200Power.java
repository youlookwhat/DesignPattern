package com.example.jingbin.designpattern.adapter;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 * 我们拥有的家用电是200v
 */

public class V200Power {

    public int provideV200Power() {
        Log.e("---", "现有类: 我们提供的是200v的家用电");
        return 200;
    }
}
