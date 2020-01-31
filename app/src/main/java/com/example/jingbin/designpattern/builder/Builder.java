package com.example.jingbin.designpattern.builder;

/**
 * Created by jingbin on 2020-01-31.
 * 抽象建造者
 */
public abstract class Builder {

    public abstract void setPart(String name, String type);

    public abstract Product getProduct();
}
