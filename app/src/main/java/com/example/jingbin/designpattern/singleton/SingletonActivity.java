package com.example.jingbin.designpattern.singleton;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivitySingletonBinding;
import com.example.jingbin.designpattern.singleton.ehan.SingletonEHan;
import com.example.jingbin.designpattern.singleton.enums.SingletonEnum;
import com.example.jingbin.designpattern.singleton.inclass.SingletonIn;
import com.example.jingbin.designpattern.singleton.lanhan.SingletonLanHan;

public class SingletonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySingletonBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_singleton);
        setTitle("单例设计模式");

        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.SINGLETON_DEFINE));
        binding.btEhan.setOnClickListener(this);
        binding.btLanhan.setOnClickListener(this);
        binding.btInclass.setOnClickListener(this);
        binding.btEnum.setOnClickListener(this);
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
