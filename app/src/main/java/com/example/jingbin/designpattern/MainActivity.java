package com.example.jingbin.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jingbin.designpattern.observer.ObserverActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jingbin on 2016/10/21.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_observer)
    Button btObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initListener();
    }

    private void initListener() {
        btObserver.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_observer:// 观察者模式
                startActivity(new Intent(this, ObserverActivity.class));
                break;
            default:
                break;
        }
    }
}
