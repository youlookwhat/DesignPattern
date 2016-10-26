package com.example.jingbin.designpattern.factory.jdgc;

/**
 * Created by jingbin on 2016/10/23.
 * 简单工厂模式
 */

public class SimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new ZSuanRoujiaMo();
                break;
            case "La":
                roujiaMo = new ZLaRoujiaMo();
                break;
            case "Tian":
                roujiaMo = new ZTianRoujiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new ZSuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}
