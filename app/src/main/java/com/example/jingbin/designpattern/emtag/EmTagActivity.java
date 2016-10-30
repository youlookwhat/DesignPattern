package com.example.jingbin.designpattern.emtag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jingbin on 2016/10/24.
 *
 * 将<em></em> 标签里的文字换为主题色(或可以点击):
 * 1. em为系统已经定义为斜体了,所以不能再改变样式了
 * 2. 将em换为我们自己自定义的标签,然后通过自定义标签改变文字颜色或使其可以点击
 */
public class EmTagActivity extends AppCompatActivity {

    @BindView(R.id.tv_txt)
    TextView tvTxt;
    @BindView(R.id.activity_em_tag)
    RelativeLayout activityEmTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_em_tag);
        ButterKnife.bind(this);
        setTitle("自定义HTML标签");

        String text = "血液检测有可能诊断的<em>黄金标准</em>借记卡<em>黄金标准</em>";
        tvTxt.setText(LightTagHandler.fromHtml(text));
//        tvTxt.setText(EMTagHandler.fromHtml(text));
    }
}
