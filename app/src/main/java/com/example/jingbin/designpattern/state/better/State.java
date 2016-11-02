package com.example.jingbin.designpattern.state.better;

/**
 * Created by jingbin on 2016/11/2.
 * 需求:
 * 现在为了提升销量，当用户每次转动手柄买商品的时候，有10%的几率赠送一瓶。
 * 下面开始重构，我们现在有5种状态，对应4个动作（投币、退币、转动手柄、发出商品），
 * 下面首先定义一个状态的超类型：
 * 状态的接口:
 */
public interface State {
    /**
     * 放钱
     */
    public void insertMoney();

    /**
     * 退钱
     */
    public void backMoney();

    /**
     * 转动曲柄
     */
    public void turnCrank();

    /**
     * 出商品
     */
    public void dispense();
}
