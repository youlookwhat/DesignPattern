package com.example.jingbin.designpattern.mediator;

import android.util.Log;

import java.util.Date;

/**
 * Created by jingbin on 2020-02-02.
 * 1. 创建中介类。
 */
public class CharRoom {
    public static void showMessage(User user, String message) {
        Log.e("---", new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
