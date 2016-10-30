package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 */

public class DefendTMS implements IDefendBehavior {

    @Override
    public void defend() {
        Log.e("---", "铁布衫");
    }
}
