package com.example.jingbin.designpattern.factory.cxgc;


/**
 * Created by jingbin on 2016/10/24.
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare(new XianRoujiaMoYLFoctory());
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
