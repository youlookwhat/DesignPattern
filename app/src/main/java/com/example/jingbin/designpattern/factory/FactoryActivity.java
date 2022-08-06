package com.example.jingbin.designpattern.factory;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityRoujiaMoStoreBinding;
import com.example.jingbin.designpattern.factory.cxgc.XianRoujiaMoTeSeStore;
import com.example.jingbin.designpattern.factory.cxgc.XianSimpleRoujiaMoTeSeFactory;
import com.example.jingbin.designpattern.factory.gcff.XianRoujiaMoStore;
import com.example.jingbin.designpattern.factory.gcff.XianSimpleRoujiaMoFactory;
import com.example.jingbin.designpattern.factory.jdgc.RoujiaMoStore;
import com.example.jingbin.designpattern.factory.jdgc.SimpleRoujiaMoFactory;

/**
 * Created by jingbin on 2016/10/22.
 * <p>
 * 今天继续设计模式之旅，给大家带来工厂模式，简单列一下这个模式的家族：
 * 1、静态工厂模式
 * 2、简单工厂模式
 * 3、工厂方法模式
 * 4、抽象工厂模式
 * <p>
 * <p>
 * 1、静态工厂模式
 * 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。下面开始详细介绍：略
 */
public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityRoujiaMoStoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_roujia_mo_store);
        setTitle("工厂模式");

        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.JDGC_FACTORY_DEFINE));
        binding.tvDefine2.setText(EMTagHandler.fromHtml(AppConstant.GCFF_FACTORY_DEFINE));
        binding.tvDefine3.setText(EMTagHandler.fromHtml(AppConstant.CXGC_FACTORY_DEFINE));
        initListener();
    }

    private void initListener() {
        binding.btStaticFactory.setOnClickListener(this);
        binding.btSimpleFactory.setOnClickListener(this);
        binding.btFactoryMethod.setOnClickListener(this);
        binding.btAbstractFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_static_factory:// 1.静态工厂模式
                Toast.makeText(this, "TextUtil.isEmpty等，类+静态方法.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_simple_factory: // 2.简单工厂模式 (店里卖肉夹馍)
                // 通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
                RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRoujiaMoFactory());
                roujiaMoStore.sellRoujiaMo("Suan");
                roujiaMoStore.sellRoujiaMo("Tian");
                roujiaMoStore.sellRoujiaMo("La");
                break;
            case R.id.bt_factory_method: // 3.工厂方法模式 (开分店)
                // 定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。
                XianRoujiaMoStore xianRoujiaMoStore = new XianRoujiaMoStore(new XianSimpleRoujiaMoFactory());// 分店简单工厂
                xianRoujiaMoStore.sellRoujiaMo("Suan");
                xianRoujiaMoStore.sellRoujiaMo("Tian");
                xianRoujiaMoStore.sellRoujiaMo("La");
                break;
            case R.id.bt_abstract_factory:// 4.抽象工厂模式 (使用官方提供的原料)
                // 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
                XianRoujiaMoTeSeStore xianRoujiaMoTeSeStore = new XianRoujiaMoTeSeStore(new XianSimpleRoujiaMoTeSeFactory());
                xianRoujiaMoTeSeStore.sellRoujiaMo("suan");
                break;
            default:
                break;
        }
    }
}
