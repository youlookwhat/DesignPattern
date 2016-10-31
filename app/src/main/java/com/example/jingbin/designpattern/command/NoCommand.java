package com.example.jingbin.designpattern.command;

import android.widget.Toast;

import com.example.jingbin.designpattern.app.PatternApplication;

/**
 * Created by jingbin on 2016/10/31.
 * 避免=null的情况
 */

public class NoCommand implements Command {

    @Override
    public void execute() {
        Toast.makeText(PatternApplication.getInstance(), "哥们,这个没效!", Toast.LENGTH_SHORT).show();
    }
}
