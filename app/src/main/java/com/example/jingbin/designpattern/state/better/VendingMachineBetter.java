package com.example.jingbin.designpattern.state.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/11/2.
 * 自动售货机
 */

public class VendingMachineBetter {

    private int count = 0;
    private State currentState;
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;
    private State winnerState;

    public VendingMachineBetter(int count) {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    /**
     * 放钱
     */
    public void insertMoney() {
        currentState.insertMoney();
    }

    /**
     * 退钱
     */
    public void backMoney() {
        currentState.backMoney();
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState) {
            currentState.dispense();//两种情况会出货
        }
    }

    /**
     * 出商品
     */
    public void dispense() {
        Log.e("VendingMachineBetter", "---发出一件商品");
        if (count > 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }


}
