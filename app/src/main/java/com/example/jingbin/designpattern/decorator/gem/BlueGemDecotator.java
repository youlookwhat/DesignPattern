package com.example.jingbin.designpattern.decorator.gem;

import com.example.jingbin.designpattern.decorator.IEquip;

/**
 * Created by jingbin on 2016/11/1.
 * 蓝宝石装饰品
 * 每颗攻击力: +5
 * 这与武器等不同,它是可以累加的,而武器不能
 */

public class BlueGemDecotator implements IEuipDecotator {

    private IEquip iEquip;

    public BlueGemDecotator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 5 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 蓝宝石";
    }
}
