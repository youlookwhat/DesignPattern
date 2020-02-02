package com.example.jingbin.designpattern.interpreter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.databinding.ActivityInterpreterBinding;
import com.example.jingbin.designpattern.interpreter.expressionimpl.AndExpression;
import com.example.jingbin.designpattern.interpreter.expressionimpl.OrExpression;
import com.example.jingbin.designpattern.interpreter.expressionimpl.TerminalExpression;

/**
 * @author jingbin
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。这种模式被用在 SQL 解析、符号处理引擎等。
 * <p>
 * 主要解决：对于一些固定文法构建一个解释句子的解释器。
 */
public class InterpreterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInterpreterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_interpreter);
        setTitle("解释器模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.INTERPRETER_DEFINE));

        // 3. InterpreterPatternDemo 使用 Expression 类来创建规则，并解析它们
        binding.btMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression maleExpression = getMaleExpression();
                // jingbin is male: true
                Log.e("---", "jingbin is male: " + maleExpression.interpreter("jingbin"));
            }
        });

        binding.btMarriedWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression womanExpression = getMarriedWomanExpression();
                // Julie is married woman: true
                Log.e("---", "Julie is married woman: " + womanExpression.interpreter("Married Julie"));
            }
        });
    }

    /**
     * 规则：jingbin 和 youlookwhat 是男性
     */
    public static Expression getMaleExpression() {
        TerminalExpression jingbin = new TerminalExpression("jingbin");
        TerminalExpression youlookwhat = new TerminalExpression("youlookwhat");
        return new OrExpression(jingbin, youlookwhat);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     */
    public static Expression getMarriedWomanExpression() {
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
