package com.example.jingbin.designpattern.decorator.gem;

import com.example.jingbin.designpattern.decorator.IEquip;

/**
 * Created by jingbin on 2016/11/1.
 * 红宝石装饰品
 * 每颗攻击力: +15
 * 这与武器等不同,它是可以累加的,而武器不能
 */

public class RedGemDecotator implements IEuipDecotator {

    private IEquip iEquip;

    public RedGemDecotator(IEquip iEquip) {
        this.iEquip = iEquip;
    }

    /**
     * 累加攻击力
     */
    @Override
    public int caculateAttack() {
        return 15 + iEquip.caculateAttack();
    }

    @Override
    public String description() {
        return iEquip.description() + "+ 红宝石";
    }
}
