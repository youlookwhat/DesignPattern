package com.example.jingbin.designpattern.factory.cxgc;


/**
 * Created by jingbin on 2016/10/24.
 * <p>
 * 在北京和西安 开分店:
 * 工厂方法模式:
 * 定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 工厂方法模式把类实例化的过程推迟到子类。
 * <p>
 * 对照定义：
 * 1、定义了创建对象的一个接口：public abstract RouJiaMo sellRoujiaMo(String type);
 * 2、由子类决定实例化的类，可以看到我们的馍是子类生成的。
 * <p>
 * <p>
 * RoujiaMo使用的是本 抽象工厂内的类
 */

public abstract class RoujiaMoStore {

    public abstract RoujiaMo sellRoujiaMo(String type);

//    public RoujiaMo sellRoujiaMo(String type) {
//
//        RoujiaMo roujiaMo = creatRoujiaMo(type);
//        roujiaMo.prepare();
//        roujiaMo.fire();
//        roujiaMo.pack();
//        return roujiaMo;
//
//    }

}
