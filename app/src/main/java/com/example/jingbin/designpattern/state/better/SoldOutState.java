package com.example.jingbin.designpattern.state.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 * 售罄的状态
 */

public class SoldOutState implements State {

    private VendingMachineBetter machineBetter;

    public SoldOutState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        Log.e("SoldOutState", "---投币失败,商品已售罄...");
    }

    @Override
    public void backMoney() {
        Log.e("SoldOutState", "---您未投币,想退钱么?");
    }

    @Override
    public void turnCrank() {
        Log.e("SoldOutState", "---商品售罄，转动手柄也木有用...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态!");
    }
}
