package com.example.jingbin.designpattern.prototype.shapeimpl;

import android.util.Log;

import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by jingbin on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Circle 圆形
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        Log.e("---", "Inside Circle::draw() method.");
    }

}
