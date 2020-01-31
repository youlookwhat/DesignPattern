package com.example.jingbin.designpattern.prototype.shapeimpl;

import android.util.Log;

import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by jingbin on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Rectangle 矩形
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        Log.e("---", "Inside Rectangle::draw() method.");
    }


}
