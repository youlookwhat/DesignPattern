package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 * 灯光
 */

public class Light {

    public void down() {
        Log.e("Light", "---将灯光调暗");
    }

    public void up() {
        Log.e("Light", "---将灯光调亮");
    }
}
