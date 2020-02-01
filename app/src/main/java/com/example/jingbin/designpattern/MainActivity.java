package com.example.jingbin.designpattern;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

import com.example.jingbin.designpattern.adapter.AdapterActivity;
import com.example.jingbin.designpattern.builder.BuilderActivity;
import com.example.jingbin.designpattern.command.CommandActivity;
import com.example.jingbin.designpattern.databinding.ActivityMainBinding;
import com.example.jingbin.designpattern.decorator.DecoratorActivity;
import com.example.jingbin.designpattern.facade.FacadeActivity;
import com.example.jingbin.designpattern.factory.FactoryActivity;
import com.example.jingbin.designpattern.flyweight.FlyweightActivity;
import com.example.jingbin.designpattern.observer.ObserverActivity;
import com.example.jingbin.designpattern.prototype.PrototypeActivity;
import com.example.jingbin.designpattern.proxy.ProxyActivity;
import com.example.jingbin.designpattern.singleton.SingletonActivity;
import com.example.jingbin.designpattern.state.StateActivity;
import com.example.jingbin.designpattern.strategy.StrategyActivity;
import com.example.jingbin.designpattern.templatemethod.TemplateMethodActivity;

import java.util.Arrays;

import me.jingbin.library.ByRecyclerView;
import me.jingbin.library.adapter.BaseByViewHolder;
import me.jingbin.library.adapter.BaseRecyclerAdapter;

/**
 * Created by jingbin on 2016/10/21.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] patterns = {
            "观察者模式", "工厂模式", "单例设计模式",
            "策略模式", "适配器模式", "命令模式",
            "装饰者模式", "外观模式", "模板方法模式",
            "状态模式", "建造者模式", "原型模式",
            "享元模式", "代理模式"
    };
    private Class[] classes = {
            ObserverActivity.class, FactoryActivity.class, SingletonActivity.class,
            StrategyActivity.class, AdapterActivity.class, CommandActivity.class,
            DecoratorActivity.class, FacadeActivity.class, TemplateMethodActivity.class,
            StateActivity.class, BuilderActivity.class, PrototypeActivity.class,
            FlyweightActivity.class, ProxyActivity.class
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
    }

    private void initView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        binding.recyclerView.setLayoutManager(gridLayoutManager);
        binding.recyclerView.setAdapter(new BaseRecyclerAdapter<String>(R.layout.item_main, Arrays.asList(patterns)) {
            @Override
            protected void bindView(BaseByViewHolder holder, String title, int position) {
                holder.setText(R.id.bt_button, title);
            }
        });
        binding.recyclerView.setOnItemClickListener(new ByRecyclerView.OnItemClickListener() {
            @Override
            public void onClick(View v, int position) {
                startActivity(new Intent(v.getContext(), classes[position]));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.recyclerView.destroy();
    }
}
