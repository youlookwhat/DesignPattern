package com.example.jingbin.designpattern.factory.classs;

/**
 * Created by jingbin on 2016/10/23.
 * 简单工厂模式
 */

public class SimpleRoujiaMoFactory {

    public RoujiaMo creatRojiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new SuanRoujiaMo();
                break;
            case "La":
                roujiaMo = new LaRoujiaMo();
                break;
            case "Tian":
                roujiaMo = new TianRoujiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new SuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}
