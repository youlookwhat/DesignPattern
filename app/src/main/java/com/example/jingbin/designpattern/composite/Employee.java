package com.example.jingbin.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingbin on 2020-02-02.
 * 1. 创建 Employee 类，该类带有 Employee 对象的列表。
 */
public class Employee {

    private String name;
    // 部门
    private String dept;
    // 工资
    private int salary;
    // 员工 list
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
