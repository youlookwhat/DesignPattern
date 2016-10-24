package com.example.jingbin.designpattern.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.factory.classs.RoujiaMoStore;
import com.example.jingbin.designpattern.factory.classs.SimpleRoujiaMoFactory;

import butterknife.BindView;
import butterknife.ButterKnife;

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
public class RoujiaMoStoreActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_simple_factory)
    Button btSimpleFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roujia_mo_store);
        ButterKnife.bind(this);
        setTitle("工厂模式");
        btSimpleFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_simple_factory: // 2.简单工厂模式
                RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRoujiaMoFactory());
                roujiaMoStore.sellRoujiaMo("Suan");
                roujiaMoStore.sellRoujiaMo("Tian");
                roujiaMoStore.sellRoujiaMo("La");
            default:
                break;
        }
    }
}
