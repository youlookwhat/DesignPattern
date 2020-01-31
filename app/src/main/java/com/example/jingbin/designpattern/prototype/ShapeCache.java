package com.example.jingbin.designpattern.prototype;

import com.example.jingbin.designpattern.prototype.shapeimpl.Circle;
import com.example.jingbin.designpattern.prototype.shapeimpl.Rectangle;
import com.example.jingbin.designpattern.prototype.shapeimpl.Square;

import java.util.Hashtable;

/**
 * Created by jingbin on 2020-01-31.
 * 3. 创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape shapeCache = shapeMap.get(shapeId);
        return (Shape) shapeCache.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
