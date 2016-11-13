package com.example.jingbin.designpattern.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.observer.classs.ObjectFor3D;
import com.example.jingbin.designpattern.observer.classs.ObserverUser1;
import com.example.jingbin.designpattern.observer.classs.ObserverUser2;
import com.example.jingbin.designpattern.observer.javautil.Observer1;
import com.example.jingbin.designpattern.observer.javautil.SubjectFor3d;
import com.example.jingbin.designpattern.observer.javautil.SubjectForSSQ;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 可以看出，使用Java内置的类实现观察者模式，代码非常简洁，
 * 对了addObserver,removeObserver,notifyObservers都已经为我们实现了，
 * 所有可以看出Observable（主题）是一个类，而不是一个接口，
 * 基本上书上都对于Java的如此设计抱有反面的态度，觉得Java内置的观察者模式，
 * 违法了面向接口编程这个原则，但是如果转念想一想，
 * 的确你拿一个主题在这写观察者模式（我们自己的实现），
 * 接口的思想很好，但是如果现在继续添加很多个主题，
 * 每个主题的ddObserver,removeObserver,notifyObservers代码基本都是相同的吧，
 * 接口是无法实现代码复用的，而且也没有办法使用组合的模式实现这三个方法的复用，
 * 所以我觉得这里把这三个方法在类中实现是合理的。
 */
public class ObserverActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.bt_observer)
    Button btObserver;
    @BindView(R.id.bt_myself)
    Button btMyself;
    @BindView(R.id.bt_system)
    Button btSystem;
    @BindView(R.id.activity_observer)
    LinearLayout activityObserver;

    private ObjectFor3D objectFor3D;
    private ObserverUser1 observerUser1;
    private ObserverUser2 observerUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);
        setTitle("观察者模式");
        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.OBSERVER_DEFINE));

        btMyself.setOnClickListener(this);
        btSystem.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_myself:// 自己实现的3D服务号
                // 创建服务号
                objectFor3D = new ObjectFor3D();

                // 创建两个订阅者
                observerUser1 = new ObserverUser1(objectFor3D);
                observerUser2 = new ObserverUser2(objectFor3D);

                // 两个观察者,发送两条信息
                objectFor3D.setMsg("201610121 的3D号为:127");
                objectFor3D.setMsg("20161022 的3D号为:000");
                break;
            case R.id.bt_system://使用Java内置的类实现观察者模式
                loadSystemObserver();
                break;
            default:
                break;
        }
    }

    /**
     * 系统的观察者接口
     */
    private void loadSystemObserver() {
        // 创建2个服务号
        SubjectFor3d subjectFor3d = new SubjectFor3d();//3d
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ();//双色球

        // 创建订阅者
        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);

        // 发送信息
        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (observerUser1 != null) {
            objectFor3D.removeObserver(observerUser1);
        }
        if (observerUser2 != null) {
            objectFor3D.removeObserver(observerUser2);
        }
        objectFor3D = null;
    }
}
