package com.example.jingbin.designpattern.decorator;

/**
 * Created by jingbin on 2016/11/1.
 * 装备的接口
 * 下面有:武器,护腕,鞋子,戒指、、、、还有装饰品接口
 */

public interface IEquip {

    /**
     * 计算攻击力
     */
    public int caculateAttack();

    /**
     * 装备的描述
     */
    public String description();
}
