package com.example.jingbin.designpattern.observer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.observer.classs.ObjectFor3D;
import com.example.jingbin.designpattern.observer.classs.ObserverUser1;
import com.example.jingbin.designpattern.observer.classs.ObserverUser2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ObserverActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.bt_observer1)
    Button btObserver1;
    @BindView(R.id.bt_observer2)
    Button btObserver2;

    private ObjectFor3D objectFor3D;
    private ObserverUser1 observerUser1;
    private ObserverUser2 observerUser2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);

        objectFor3D = new ObjectFor3D();
        btObserver1.setOnClickListener(this);
        btObserver2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_observer1:
                if (observerUser1 == null) {
                    observerUser1 = new ObserverUser1(objectFor3D);
                }
                observerUser1.update("20161021 的3D号为:127");
                break;
            case R.id.bt_observer2:
                if (observerUser2 == null) {
                    observerUser2 = new ObserverUser2(objectFor3D);
                }
                observerUser2.update("20161022 的3D号为:000");
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (observerUser1 != null) {
            objectFor3D.registerObserver(observerUser1);
        }
        if (observerUser2 != null) {
            objectFor3D.registerObserver(observerUser2);
        }
        objectFor3D = null;
    }
}
