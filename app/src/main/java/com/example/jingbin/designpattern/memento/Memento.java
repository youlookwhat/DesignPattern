package com.example.jingbin.designpattern.memento;

/**
 * Created by jingbin on 2020-02-02.
 * 1. 创建 Memento 类。备忘录
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
