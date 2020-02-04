package com.example.jingbin.designpattern.visitor;

import android.util.Log;

import com.example.jingbin.designpattern.visitor.impl.Computer;
import com.example.jingbin.designpattern.visitor.impl.Keyboard;
import com.example.jingbin.designpattern.visitor.impl.Monitor;
import com.example.jingbin.designpattern.visitor.impl.Mouse;

/**
 * Created by jingbin on 2020-02-04.
 * 4. 创建实现了 ComputerPartVisitor 的实体访问者。
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        Log.e("---", "Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        Log.e("---", "Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        Log.e("---", "Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        Log.e("---", "Displaying Monitor.");
    }
}
