package com.example.jingbin.designpattern.observer.javautil;


import java.util.Observable;

/**
 * Created by jingbin on 2016/10/21.
 * <p>
 * 对于JDK或者Andorid中都有很多地方实现了观察者模式，
 * 比如XXXView.addXXXListenter ， 当然了 XXXView.setOnXXXListener不一定是观察者模式，
 * 因为观察者模式是一种一对多的关系，
 * 对于setXXXListener是1对1的关系，应该叫回调。
 * <p>
 * 首先是一个3D彩票服务号主题：
 */

public class SubjectFor3d extends Observable {

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
