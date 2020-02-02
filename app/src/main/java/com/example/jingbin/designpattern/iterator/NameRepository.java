package com.example.jingbin.designpattern.iterator;

/**
 * Created by jingbin on 2020-02-02.
 * 2. 创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
 */
public class NameRepository implements Container {

    private String names[] = {"John", "jingbin", "youlookwhat", "lookthis"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
