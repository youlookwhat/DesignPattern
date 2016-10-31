package com.example.jingbin.designpattern.command;

/**
 * Created by jingbin on 2016/10/31.
 * 开门的命令
 */

public class DoorOpenCommand implements Command {

    private Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
