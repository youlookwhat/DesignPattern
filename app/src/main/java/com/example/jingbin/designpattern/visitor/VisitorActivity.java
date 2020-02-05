package com.example.jingbin.designpattern.visitor;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityVisitorBinding;
import com.example.jingbin.designpattern.visitor.impl.Computer;

/**
 * @author jingbin
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。
 * 这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 * <p>
 * 主要解决：稳定的数据结构和易变的操作耦合问题。
 */
public class VisitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityVisitorBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_visitor);
        setTitle("访问者模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.VISITOR_DEFINE));

        // 5. 使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。
        binding.btComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ComputerPart computer = new Computer();
                computer.accept(new ComputerPartDisplayVisitor());
                /*
                 *打印：
                 *---: Displaying Mouse.
                 *---: Displaying Keyboard.
                 *---: Displaying Monitor.
                 *---: Displaying Computer.
                 */
            }
        });
    }
}
