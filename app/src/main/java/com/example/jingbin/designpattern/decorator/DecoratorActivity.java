package com.example.jingbin.designpattern.decorator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityDecoratorBinding;
import com.example.jingbin.designpattern.decorator.equip.RingEquip;
import com.example.jingbin.designpattern.decorator.equip.ShoeEquip;
import com.example.jingbin.designpattern.decorator.gem.BlueGemDecorator;
import com.example.jingbin.designpattern.decorator.gem.RedGemDecorator;
import com.example.jingbin.designpattern.decorator.gem.YellowGemDecorator;

/**
 * 装饰者模式:
 * 装饰者模式：若要扩展功能，装饰者提供了比集成更有弹性的替代方案，动态地将责任附加到对象上。
 * 先简单描述下装饰者模式发挥作用的地方，当我们设计好了一个类，我们需要给这个类添加一些辅助的功能，
 * 并且不希望改变这个类的代码，这时候就是装饰者模式大展雄威的时候了。
 * 这里还体现了一个原则：类应该对扩展开放，对修改关闭。
 * eg:
 * 1、武器（攻击力20） 、戒指（攻击力5）、护腕（攻击力5）、鞋子（攻击力5）
 * 2、蓝宝石（攻击力5/颗）、黄宝石（攻击力10/颗）、红宝石（攻击力15/颗）
 * 3、每个装备可以随意镶嵌3颗
 */
public class DecoratorActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDecoratorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_decorator);
        setTitle("装饰者模式");

        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.DECORATOR_DEFINE));
        binding.btDemo1.setText("一个镶嵌2颗红宝石,1颗蓝宝石的靴子");
        binding.btDemo2.setText("一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指");

        binding.btDecorator.setOnClickListener(this);
        binding.btDemo1.setOnClickListener(this);
        binding.btDemo2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_decorator:// 外观模式
                break;

            case R.id.bt_demo1:
                Log.e("---", "一个镶嵌2颗红宝石,1颗蓝宝石的靴子: ");

                IEquip iEquip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
                Log.e("---", "攻击力:" + iEquip.caculateAttack());
                Log.e("---", "描述语:" + iEquip.description());
                break;

            case R.id.bt_demo2:
                Log.e("---", "一个镶嵌1颗红宝石,1颗蓝宝石,1颗黄宝石的戒指: ");
                RedGemDecorator redGemDecorator = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new RingEquip())));
                Log.e("---", "攻击力:" + redGemDecorator.caculateAttack());
                Log.e("---", "描述语:" + redGemDecorator.description());
                break;
            default:
                break;
        }
    }
}
