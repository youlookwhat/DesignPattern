package com.example.jingbin.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingbin on 2020-02-02.
 * 3. 创建 CareTaker 类。 管理员
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
