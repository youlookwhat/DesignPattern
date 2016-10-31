package com.example.jingbin.designpattern.command;

/**
 * Created by jingbin on 2016/10/31.
 * 定义一个命令,可以干一系列的事情。
 * 可以执行一连串的命令
 */

public class QuickCommand implements Command {

    private Command[] commands;

    public QuickCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
