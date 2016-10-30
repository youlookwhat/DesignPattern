package com.example.jingbin.designpattern.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.factory.cxgc.XianRoujiaMoTeSeStore;
import com.example.jingbin.designpattern.factory.cxgc.XianSimpleRoujiaMoTeSeFactory;
import com.example.jingbin.designpattern.factory.gcff.XianRoujiaMoStore;
import com.example.jingbin.designpattern.factory.gcff.XianSimpleRoujiaMoFactory;
import com.example.jingbin.designpattern.factory.jdgc.RoujiaMoStore;
import com.example.jingbin.designpattern.factory.jdgc.SimpleRoujiaMoFactory;

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
public class FactoryActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_simple_factory)
    Button btSimpleFactory;
    @BindView(R.id.bt_factory_method)
    Button btFactoryMethod;
    @BindView(R.id.bt_static_factory)
    Button btStaticFactory;
    @BindView(R.id.bt_abstract_factory)
    Button btAbstractFactory;
    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_roujia_mo_store)
    LinearLayout activityRoujiaMoStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roujia_mo_store);
        ButterKnife.bind(this);
        setTitle("工厂模式");
        initListener();
    }

    private void initListener() {
        btStaticFactory.setOnClickListener(this);
        btSimpleFactory.setOnClickListener(this);
        btFactoryMethod.setOnClickListener(this);
        btAbstractFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_static_factory:// 1.静态工厂模式
                Toast.makeText(this, "TextUtil.isEmpty等，类+静态方法.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_simple_factory: // 2.简单工厂模式(店里买肉夹馍)
                RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRoujiaMoFactory());
                roujiaMoStore.sellRoujiaMo("Suan");
                roujiaMoStore.sellRoujiaMo("Tian");
                roujiaMoStore.sellRoujiaMo("La");
                break;
            case R.id.bt_factory_method: // 3.工厂方法模式(开分店)
                // 分店简单工厂
                XianRoujiaMoStore xianRoujiaMoStore = new XianRoujiaMoStore(new XianSimpleRoujiaMoFactory());
                xianRoujiaMoStore.sellRoujiaMo("Suan");
                xianRoujiaMoStore.sellRoujiaMo("Tian");
                xianRoujiaMoStore.sellRoujiaMo("La");
                break;
            case R.id.bt_abstract_factory:// 4.抽象工厂模式(使用官方提供的原料)
                XianRoujiaMoTeSeStore xianRoujiaMoTeSeStore = new XianRoujiaMoTeSeStore(new XianSimpleRoujiaMoTeSeFactory());
                xianRoujiaMoTeSeStore.sellRoujiaMo("suan");
                break;
            default:
                break;
        }
    }
}
