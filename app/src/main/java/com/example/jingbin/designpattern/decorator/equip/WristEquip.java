package com.example.jingbin.designpattern.decorator.equip;

import com.example.jingbin.designpattern.decorator.IEquip;

/**
 * Created by jingbin on 2016/11/1.
 * 护腕
 * 攻击力: 5
 */

public class WristEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战护腕";
    }
}
