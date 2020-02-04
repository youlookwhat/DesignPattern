package com.example.jingbin.designpattern.visitor;

import com.example.jingbin.designpattern.visitor.impl.Computer;
import com.example.jingbin.designpattern.visitor.impl.Keyboard;
import com.example.jingbin.designpattern.visitor.impl.Monitor;
import com.example.jingbin.designpattern.visitor.impl.Mouse;

/**
 * Created by jingbin on 2020-02-04.
 * 3. 定义一个表示访问者的接口。
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
