package com.example.jingbin.designpattern.observer.classs;

import android.util.Log;
import android.widget.Toast;

import com.example.jingbin.designpattern.app.PatternApplication;
import com.example.jingbin.designpattern.observer.interfaces.Observer;
import com.example.jingbin.designpattern.observer.interfaces.Subject;

/**
 * Created by jingbin on 2016/10/21.
 * 模拟第一个使用者
 */

public class ObserverUser1 implements Observer {

    public ObserverUser1(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        Log.e("-----ObserverUser1 ", "得到 3D 号码:" + msg);
        Toast.makeText(PatternApplication.getInstance(), "-----ObserverUser1 得到 3D 号码:" + msg, Toast.LENGTH_LONG).show();
    }
}
