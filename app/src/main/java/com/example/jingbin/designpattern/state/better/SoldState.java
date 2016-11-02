package com.example.jingbin.designpattern.state.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 * 售卖状态
 */

public class SoldState implements State {


    private VendingMachineBetter machineBetter;

    public SoldState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        Log.e("SoldState", "---正在出货,请勿投币");
    }

    @Override
    public void backMoney() {
        Log.e("SoldState", "---正在出货,没有可退的钱");
    }

    @Override
    public void turnCrank() {
        Log.e("SoldState", "---正在出货,请勿重复摇动手柄");
    }

    @Override
    public void dispense() {
        machineBetter.dispense();
        if (machineBetter.getCount() > 0) {
            machineBetter.setState(machineBetter.getNoMoneyState());
        } else {
            Log.e("SoldState", "---商品已经售罄");
            machineBetter.setState(machineBetter.getSoldOutState());
        }
    }
}
