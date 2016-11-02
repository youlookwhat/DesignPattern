package com.example.jingbin.designpattern.facade.device;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 * 投影仪
 */

public class Projector {

    public void on() {
        Log.e("Projector", "---打开投影仪");
    }

    public void off() {
        Log.e("Projector", "---关闭投影仪");
    }

    public void close() {
        Log.e("Projector", "---收起投影仪投影区");
    }

    public void open() {
        Log.e("Projector", "---放下投影仪投影区");
    }
}
