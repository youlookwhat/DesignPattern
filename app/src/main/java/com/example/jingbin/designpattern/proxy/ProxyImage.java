package com.example.jingbin.designpattern.proxy;

/**
 * Created by jingbin on 2020-02-01.
 * 2. 创建实现接口的实体类。
 */
public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
