package com.example.jingbin.designpattern.command;

/**
 * Created by jingbin on 2016/10/31.
 * 遥控器按钮  一共9个按钮
 */

public class ControlPanel {

    private static final int CONTROL_SIZE = 9;

    private Command[] commands;

    public ControlPanel() {

        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    /**
     * 设置每个按钮对应的位置
     */
    public void setCommands(int index, Command command) {
        commands[index] = command;
    }

    /**
     * 模拟点击按钮
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }
}
