package com.example.jingbin.designpattern.strategy.old;

/**
 * Created by jingbin on 2016/10/30.
 * 游戏角色的超类
 */

public abstract class Role {

    protected String name;

    // 着装
    protected abstract void display();

    // 逃跑
    protected abstract void run();

    // 攻击
    protected abstract void attack();

    // 防御
    protected abstract void defend();
}
