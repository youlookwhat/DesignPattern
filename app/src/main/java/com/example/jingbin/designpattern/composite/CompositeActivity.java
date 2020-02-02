package com.example.jingbin.designpattern.composite;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityCompositeBinding;

/**
 * @author jingbin
 * 组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
 * 组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * <p>
 * 主要解决：
 * 它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，
 * 客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
 */
public class CompositeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCompositeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_composite);

        setTitle("组合模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.COMPOSITE_DEFINE));

        // 2. 使用 Employee 类来创建和打印员工的层次结构。
        final Employee ceo = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        binding.btCeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("---", ceo.toString());
                /*
                 * Employee{name='John', dept='CEO', salary=30000,
                 * subordinates=[Employee{name='Robert', dept='Head sales', salary=20000,
                 * subordinates=[
                 * Employee{name='Richard', dept='Sales', salary=10000, subordinates=[]},
                 * Employee{name='Rob', dept='Sales', salary=10000, subordinates=[]}]},
                 * Employee{name='Michel', dept='Head Marketing', salary=20000,
                 * subordinates=[Employee{name='Laura', dept='Marketing', salary=10000, subordinates=[]},
                 * Employee{name='Bob', dept='Marketing', salary=10000, subordinates=[]}]}]}
                 */
            }
        });

    }
}
