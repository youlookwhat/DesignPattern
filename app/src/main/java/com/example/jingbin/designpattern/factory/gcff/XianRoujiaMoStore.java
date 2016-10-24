package com.example.jingbin.designpattern.factory.gcff;

import com.example.jingbin.designpattern.factory.classs.RoujiaMo;

/**
 * Created by jingbin on 2016/10/24.
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoFactory factory;

    public XianRoujiaMoStore(XianSimpleRoujiaMoFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }

//    @Override
//    public RoujiaMo creatRoujiaMo(String type) {
//
//        RoujiaMo roujiaMo = null;
//        switch (type) {
//            case "suan":
//                roujiaMo = new XianSuanRoujiMo();
//                break;
//            case "tian":
//                roujiaMo = new XianKuRoujiMo();
//                break;
//            case "la":
//                roujiaMo = new XianlaRoujiMo();
//                break;
//            default:// 默认为 西安 酸肉夹馍
//                roujiaMo = new XianSuanRoujiMo();
//                break;
//        }
//        return roujiaMo;
//    }
}
