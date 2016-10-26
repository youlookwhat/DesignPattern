package com.example.jingbin.designpattern.observer.javautil;


import java.util.Observable;

/**
 * Created by jingbin on 2016/10/21.
 * 下面是一个双色球的服务号主题：
 */

public class SubjectForSSQ extends Observable {

    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * 更新主题消息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        setChanged();
        notifyObservers();
    }
}
