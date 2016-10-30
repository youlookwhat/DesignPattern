package com.example.jingbin.designpattern.strategy.old;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 */

public class RoleB extends Role {

    public RoleB(String name) {
        this.name = name;
    }

    @Override
    protected void display() {
        Log.e("", "样子2");
    }

    @Override
    protected void run() {
        Log.e("", "金蝉脱壳");//拷贝,显得冗余
    }

    @Override
    protected void attack() {
        Log.e("", "降龙十八掌");//拷贝,显得冗余
    }

    @Override
    protected void defend() {
        Log.e("", "铁布衫");
    }
}
