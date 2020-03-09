package com.example.jingbin.designpattern;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.jingbin.designpattern.adapter.AdapterActivity;
import com.example.jingbin.designpattern.bridge.BridgeActivity;
import com.example.jingbin.designpattern.builder.BuilderActivity;
import com.example.jingbin.designpattern.chainofresponsibility.ChainOfResponsibilityActivity;
import com.example.jingbin.designpattern.command.CommandActivity;
import com.example.jingbin.designpattern.composite.CompositeActivity;
import com.example.jingbin.designpattern.databinding.ActivityMainBinding;
import com.example.jingbin.designpattern.decorator.DecoratorActivity;
import com.example.jingbin.designpattern.facade.FacadeActivity;
import com.example.jingbin.designpattern.factory.FactoryActivity;
import com.example.jingbin.designpattern.flyweight.FlyweightActivity;
import com.example.jingbin.designpattern.interpreter.InterpreterActivity;
import com.example.jingbin.designpattern.iterator.IteratorActivity;
import com.example.jingbin.designpattern.mediator.MediatorActivity;
import com.example.jingbin.designpattern.memento.MementoActivity;
import com.example.jingbin.designpattern.observer.ObserverActivity;
import com.example.jingbin.designpattern.prototype.PrototypeActivity;
import com.example.jingbin.designpattern.proxy.ProxyActivity;
import com.example.jingbin.designpattern.singleton.SingletonActivity;
import com.example.jingbin.designpattern.state.StateActivity;
import com.example.jingbin.designpattern.strategy.StrategyActivity;
import com.example.jingbin.designpattern.templatemethod.TemplateMethodActivity;
import com.example.jingbin.designpattern.visitor.VisitorActivity;

import java.util.Arrays;

import me.jingbin.library.ByRecyclerView;
import me.jingbin.library.adapter.BaseByViewHolder;
import me.jingbin.library.adapter.BaseRecyclerAdapter;
import me.jingbin.library.decoration.GridSpaceItemDecoration;

/**
 * Created by jingbin on 2016/10/21.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] patterns = {
            "观察者模式", "工厂模式",
            "单例设计模式", "策略模式",
            "适配器模式", "命令模式",
            "装饰者模式", "外观模式",
            "模板方法模式", "状态模式",
            "建造者模式", "原型模式",
            "享元模式", "代理模式",
            "桥接模式", "组合模式",
            "迭代器模式", "中介者模式",
            "备忘录模式", "解释器模式",
            "责任链模式", "访问者模式"
    };
    private Class[] classes = {
            ObserverActivity.class, FactoryActivity.class,
            SingletonActivity.class, StrategyActivity.class,
            AdapterActivity.class, CommandActivity.class,
            DecoratorActivity.class, FacadeActivity.class,
            TemplateMethodActivity.class, StateActivity.class,
            BuilderActivity.class, PrototypeActivity.class,
            FlyweightActivity.class, ProxyActivity.class,
            BridgeActivity.class, CompositeActivity.class,
            IteratorActivity.class, MediatorActivity.class,
            MementoActivity.class, InterpreterActivity.class,
            ChainOfResponsibilityActivity.class, VisitorActivity.class
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
        binding.recyclerView.addItemDecoration(new GridSpaceItemDecoration(2, 10).setEndFromSize(0));
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.actionbar_about:
                Uri issuesUrl = Uri.parse("https://github.com/youlookwhat/DesignPattern");
                Intent intent = new Intent(Intent.ACTION_VIEW, issuesUrl);
                startActivity(intent);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.recyclerView.destroy();
    }
}
