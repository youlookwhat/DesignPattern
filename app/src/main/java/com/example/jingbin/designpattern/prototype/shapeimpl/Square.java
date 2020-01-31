package com.example.jingbin.designpattern.prototype.shapeimpl;

import android.util.Log;

import com.example.jingbin.designpattern.prototype.Shape;

/**
 * Created by jingbin on 2020-01-31.
 * 2. 创建扩展了上面抽象类的实体类。Square 正方形
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        Log.e("---", "Inside Square::draw() method.");
    }


}
