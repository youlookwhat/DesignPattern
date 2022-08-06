package com.example.jingbin.designpattern.strategy;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityStategyBinding;
import com.example.jingbin.designpattern.strategy.better.AttackXL;
import com.example.jingbin.designpattern.strategy.better.DefendTMS;
import com.example.jingbin.designpattern.strategy.better.DisplayYZ;
import com.example.jingbin.designpattern.strategy.better.RoleA;
import com.example.jingbin.designpattern.strategy.better.RunJCTQ;

/**
 * 策略模式（Strategy Pattern）：定义了算法族，分别封装起来，
 * 让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 */
public class StrategyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStategyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_stategy);
        setTitle("策略模式");

        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.STRATEGY_DEFINE));
        binding.btStrategyText.setText("创建角色A,并设定样子,攻击,逃跑,防御");


        binding.btStrategyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RoleA roleA = new RoleA("---A");
                roleA.setiDisplayBehavior(new DisplayYZ())
                        .setiAttackBehavior(new AttackXL())
                        .setiDefendBehavior(new DefendTMS())
                        .setiRunBehavior(new RunJCTQ());
                roleA.display();// 样子
                roleA.attack();// 攻击
                roleA.run();// 逃跑
                roleA.defend();// 防御
            }
        });
    }
}
