package com.example.jingbin.designpattern.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 适配器模式:
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
 * 如题目，手机充电器一般都是5V左右吧，咱天朝的家用交流电压220V，所以手机充电需要一个适配器（降压器）
 */
public class AdapterActivity extends AppCompatActivity {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_adapter)
    LinearLayout activityAdapter;
    @BindView(R.id.by_adapter)
    Button byAdapter;
    @BindView(R.id.bt_adapter_text)
    Button btAdapterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.bind(this);
        setTitle("适配器模式");
        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.ADAPTER_DEFINE));
        btAdapterText.setText("将220V家用电转换为5V");

        btAdapterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 给手机充电
                 */
                Mobile mobile = new Mobile();
                V5Power v5Power = new V5PowerAdapter(new V220Power());
                mobile.inputPower(v5Power);
            }
        });
    }
}
