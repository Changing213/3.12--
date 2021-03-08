package com.itheima.test;

public class Test1Static {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;
        stu1.school = "传智专修学院";
        stu1.show();

        Student stu2 = new Student();
        stu2.show();
    }
}
