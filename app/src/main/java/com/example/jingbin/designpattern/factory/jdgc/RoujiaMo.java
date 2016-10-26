package com.example.jingbin.designpattern.factory.jdgc;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/22.
 */

public abstract class RoujiaMo {

    protected String name;

    /**
     * 准备工作
     */
    public void prepare() {
        Log.e("---RoujiaMo:", name + ": 揉面-剁肉-完成准备工作");
    }

    /**
     * 秘制设备--烘烤2分钟
     */
    public void fire() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用设备-烘烤");
    }

    /**
     * 使用你们的专用袋-包装
     */
    public void pack() {
        Log.e("---RoujiaMo:", name + ": 肉夹馍-专用袋-包装---end");
    }
}
