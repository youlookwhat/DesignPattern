package com.example.jingbin.designpattern.flyweight;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityFlyweightBinding;

/**
 * @author jingbin
 * 享元模式（Flyweight Pattern）
 * 主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 */
public class FlyweightActivity extends AppCompatActivity {

    private static final String color[] = {"Red", "Blue", "Yellow", "White", "Black"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFlyweightBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_flyweight);
        setTitle("享元模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.FLYWEIGHT_DEFINE));

        binding.btGetCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 4. 使用该工厂，通过传递颜色信息来获取实体类的对象。
                for (int i = 0; i < 20; i++) {
                    Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
                    circle.setX(getRandomX());
                    circle.setY(getRandomY());
                    circle.setRadius(100);
                    circle.draw();
                }
            }
        });

    }

    /**
     * 0.0-1.0  * [1-6]
     */
    private static String getRandomColor() {
        return color[(int) (Math.random() * color.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
