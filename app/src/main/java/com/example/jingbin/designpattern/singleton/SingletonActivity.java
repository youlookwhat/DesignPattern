package com.example.jingbin.designpattern.singleton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.singleton.ehan.SingletonEHan;
import com.example.jingbin.designpattern.singleton.enums.SingletonEnum;
import com.example.jingbin.designpattern.singleton.inclass.SingletonIn;
import com.example.jingbin.designpattern.singleton.lanhan.SingletonLanHan;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingletonActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_ehan)
    Button btEhan;
    @BindView(R.id.bt_lanhan)
    Button btLanhan;
    @BindView(R.id.bt_inclass)
    Button btInclass;
    @BindView(R.id.bt_enum)
    Button btEnum;
    @BindView(R.id.activity_singleton)
    LinearLayout activitySingleton;
    @BindView(R.id.tv_define)
    TextView tvDefine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
        setTitle("单例设计模式");

        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.SINGLETON_DEFINE));
        btEhan.setOnClickListener(this);
        btLanhan.setOnClickListener(this);
        btInclass.setOnClickListener(this);
        btEnum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_ehan:// 饿汉式[可用]
                SingletonEHan instance = SingletonEHan.getInstance();
                break;
            case R.id.bt_lanhan:// 懒汉式[双重校验锁 推荐用]
                SingletonLanHan singletonLanHanFour = SingletonLanHan.getSingletonLanHanFour();
                break;
            case R.id.bt_inclass://内部类[推荐用]
                SingletonIn singletonIn = SingletonIn.getSingletonIn();
                break;
            case R.id.bt_enum:// 枚举[推荐用]
                SingletonEnum.instance.whateverMethod();
                break;
            default:
                break;
        }
    }
}
