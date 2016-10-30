package com.example.jingbin.designpattern.strategy.better;

/**
 * Created by jingbin on 2016/10/30.
 * 新改进的角色超类:
 * 遵循设计的原则，找出应用中可能需要变化的部分，把它们独立出来，
 * 不要和那些不需要变化的代码混在一起。
 * 我们发现，对于每个角色的display，attack，defend，run都是有可能变化的，于是我们必须把这写独立出来。
 * 再根据另一个设计原则：针对接口（超类型）编程，而不是针对实现编程，于是我们把代码改造成这样：
 */

public abstract class Role {

    protected String name;

    private IDisplayBehavior iDisplayBehavior;
    private IDefendBehavior iDefendBehavior;
    private IRunBehavior iRunBehavior;
    private IAttackBehavior iAttackBehavior;

    public Role setiDisplayBehavior(IDisplayBehavior iDisplayBehavior) {
        this.iDisplayBehavior = iDisplayBehavior;
        return this;
    }

    public Role setiDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.iDefendBehavior = iDefendBehavior;
        return this;
    }

    public Role setiRunBehavior(IRunBehavior iRunBehavior) {
        this.iRunBehavior = iRunBehavior;
        return this;
    }

    public Role setiAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
        return this;
    }

    public void display() {
        iDisplayBehavior.display();
    }

    public void defend() {
        iDefendBehavior.defend();
    }

    public void attack() {
        iAttackBehavior.attack();
    }

    public void run() {
        iRunBehavior.run();
    }
}
