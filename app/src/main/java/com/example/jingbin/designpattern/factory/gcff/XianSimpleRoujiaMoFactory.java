package com.example.jingbin.designpattern.factory.gcff;

import com.example.jingbin.designpattern.factory.jdgc.RoujiaMo;

/**
 * Created by jingbin on 2016/10/23.
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianSimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiMo();
                break;
            case "La":
                roujiaMo = new XianKuRoujiMo();
                break;
            case "Tian":
                roujiaMo = new XianlaRoujiMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiMo();
                break;
        }
        return roujiaMo;
    }
}
