package com.example.jingbin.designpattern.interpreter.expressionimpl;

import com.example.jingbin.designpattern.interpreter.Expression;

/**
 * Created by jingbin on 2020-02-02.
 * 2. 创建实现了上述接口的实体类。
 */
public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String content) {
        return expression1.interpreter(content) || expression2.interpreter(content);
    }
}
