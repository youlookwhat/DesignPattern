package com.example.jingbin.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jingbin.designpattern.adapter.AdapterActivity;
import com.example.jingbin.designpattern.command.CommandActivity;
import com.example.jingbin.designpattern.decorator.DecoratorActivity;
import com.example.jingbin.designpattern.facade.FacadeActivity;
import com.example.jingbin.designpattern.factory.FactoryActivity;
import com.example.jingbin.designpattern.observer.ObserverActivity;
import com.example.jingbin.designpattern.singleton.SingletonActivity;
import com.example.jingbin.designpattern.state.StateActivity;
import com.example.jingbin.designpattern.strategy.StrategyActivity;
import com.example.jingbin.designpattern.templatemethod.TemplateMethodActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jingbin on 2016/10/21.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_observer)
    Button btObserver;
    @BindView(R.id.bt_factory)
    Button btFactory;
    @BindView(R.id.bt_singleton)
    Button btSingleton;
    @BindView(R.id.bt_strategy)
    Button btStrategy;
    @BindView(R.id.bt_adapter)
    Button btAdapter;
    @BindView(R.id.bt_command)
    Button btCommand;
    @BindView(R.id.bt_decorator)
    Button btDecorator;
    @BindView(R.id.bt_facade)
    Button btFacade;
    @BindView(R.id.bt_template_method)
    Button btTemplateMethod;
    @BindView(R.id.bt_state)
    Button btState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initListener();
    }

    private void initListener() {
        btObserver.setOnClickListener(this);
        btFactory.setOnClickListener(this);
        btSingleton.setOnClickListener(this);
        btStrategy.setOnClickListener(this);
        btAdapter.setOnClickListener(this);
        btCommand.setOnClickListener(this);
        btDecorator.setOnClickListener(this);
        btFacade.setOnClickListener(this);
        btTemplateMethod.setOnClickListener(this);
        btState.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_observer:// 观察者模式
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            case R.id.bt_factory:// 工厂模式
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.bt_singleton:// 单例设计模式
                startActivity(new Intent(this, SingletonActivity.class));
                break;
            case R.id.bt_strategy:// 策略模式
                startActivity(new Intent(this, StrategyActivity.class));
                break;
            case R.id.bt_adapter:// 适配器模式
                startActivity(new Intent(this, AdapterActivity.class));
                break;
            case R.id.bt_command:// 命令模式
                startActivity(new Intent(this, CommandActivity.class));
                break;
            case R.id.bt_decorator:// 装饰者模式
                startActivity(new Intent(this, DecoratorActivity.class));
                break;
            case R.id.bt_facade:// 外观模式
                startActivity(new Intent(this, FacadeActivity.class));
                break;
            case R.id.bt_template_method:// 模板方法模式
                startActivity(new Intent(this, TemplateMethodActivity.class));
                break;
            case R.id.bt_state:// 状态模式
                startActivity(new Intent(this, StateActivity.class));
                break;
            default:
                break;
        }
    }
}
