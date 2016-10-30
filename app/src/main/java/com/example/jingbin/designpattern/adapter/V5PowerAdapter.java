package com.example.jingbin.designpattern.adapter;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 * 将200v家用电转换为5v手机用电的适配器
 */

public class V5PowerAdapter implements V5Power {

    private int v200power;

    public V5PowerAdapter(V200Power v200Power) {
        v200power = v200Power.provideV200Power();
    }

    @Override
    public int provideV5Power() {

        Log.e("---", "适配气: 经过复杂的操作,将" + v200power + "v电压转为5v");
        return 5;
    }


}
