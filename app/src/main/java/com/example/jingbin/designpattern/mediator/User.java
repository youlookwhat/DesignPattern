package com.example.jingbin.designpattern.mediator;

/**
 * Created by jingbin on 2020-02-02.
 * 2. 创建 user 类。
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        CharRoom.showMessage(this, message);
    }
}
