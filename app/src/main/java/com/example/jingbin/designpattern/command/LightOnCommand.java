package com.example.jingbin.designpattern.command;

/**
 * Created by jingbin on 2016/10/31.
 * 开灯的命令
 */

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
