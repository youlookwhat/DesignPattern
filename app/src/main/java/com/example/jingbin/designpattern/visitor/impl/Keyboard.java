package com.example.jingbin.designpattern.visitor.impl;

import com.example.jingbin.designpattern.visitor.ComputerPart;
import com.example.jingbin.designpattern.visitor.ComputerPartVisitor;

/**
 * Created by jingbin on 2020-02-04.
 * 2. 创建扩展了上述类的实体类。
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
