package com.example.jingbin.designpattern.strategy.better;

import android.util.Log;

/**
 * Created by jingbin on 2016/10/30.
 */

public class RunJCTQ implements IRunBehavior {

    @Override
    public void run() {
        Log.e("---", "金蝉脱壳");
    }
}
