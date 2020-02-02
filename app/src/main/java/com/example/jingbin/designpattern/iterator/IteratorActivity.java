package com.example.jingbin.designpattern.iterator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityIteratorBinding;

/**
 * @author jingbin
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 * <p>
 * 主要解决：不同的方式来遍历整个整合对象。
 */
public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIteratorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_iterator);
        setTitle("迭代器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.ITERATOR_DEFINE));

        binding.btPlName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3. 使用 NameRepository 来获取迭代器，并打印名字。
                NameRepository nameRepository = new NameRepository();
                for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
                    String name = (String) iterator.next();
                    Log.e("---", name);
                    /*
                     * /---: John
                     * /---: jingbin
                     * /---: youlookwhat
                     * /---: lookthis
                     */
                }
            }
        });
    }
}
