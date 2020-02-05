package com.example.jingbin.designpattern.visitor.impl;

import com.example.jingbin.designpattern.visitor.ComputerPart;
import com.example.jingbin.designpattern.visitor.ComputerPartVisitor;

/**
 * Created by jingbin on 2020-02-04.
 */
public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
