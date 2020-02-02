package com.example.jingbin.designpattern.interpreter.expressionimpl;

import com.example.jingbin.designpattern.interpreter.Expression;

/**
 * Created by jingbin on 2020-02-02.
 * 2. 创建实现了上述接口的实体类。
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String content) {
        return content.contains(data);
    }
}
