package com.example.jingbin.designpattern.mediator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityMediatorBinding;

/**
 * @author jingbin
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 * 中介者模式属于行为型模式。
 * <p>
 * 主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，
 * 同时若一个对象发生改变，我们也需要跟踪与之相关联的对象，同时做出相应的处理。
 */
public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMediatorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_mediator);
        setTitle("中介者模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.MEDIATOR_DEFINE));

        // 使用 User 对象来显示他们之间的通信。
        binding.btUser1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User jingbin = new User("jingbin");
                jingbin.sendMessage("Hi~ youlookwhat!");
                //---: Sun Feb 02 08:11:47 GMT+00:00 2020 [jingbin] : Hi~ youlookwhat!
            }
        });
        binding.btUser2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User jingbin = new User("youlookwhat");
                jingbin.sendMessage("Hi~ jingbin!");
                //---: Sun Feb 02 08:11:49 GMT+00:00 2020 [youlookwhat] : Hi~ jingbin!
            }
        });
    }
}
