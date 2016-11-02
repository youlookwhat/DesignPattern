package com.example.jingbin.designpattern.facade.theater;

import com.example.jingbin.designpattern.facade.device.Computer;
import com.example.jingbin.designpattern.facade.device.Light;
import com.example.jingbin.designpattern.facade.device.Player;
import com.example.jingbin.designpattern.facade.device.PopcornPopper;
import com.example.jingbin.designpattern.facade.device.Projector;

/**
 * Created by jingbin on 2016/11/2.
 * 家庭影院
 */

public class HomeTheaterFacade {

    private Computer computer;
    private Light light;
    private Player player;
    private PopcornPopper popcornPopper;
    private Projector projector;

    public HomeTheaterFacade(Computer computer, Light light, Player player, PopcornPopper popcornPopper, Projector projector) {
        this.computer = computer;
        this.light = light;
        this.player = player;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
    }

    /**
     * 一键观影
     */
    public void watchMovie() {
        computer.on();
        light.down();
        popcornPopper.on();
        popcornPopper.makePopcorn();
        projector.on();
        projector.open();
        player.on();
        player.make3DListener();
    }

    /**
     * 一键关闭
     */
    public void stopMovie() {
        computer.off();
        light.up();
        player.off();
        popcornPopper.off();
        projector.close();
        projector.off();
    }
}
