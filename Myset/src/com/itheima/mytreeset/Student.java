package com.itheima.mytreeset;

public class Student implements Comparable<Student>{
    //实现了Comparable自然排序接口

    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        //按照对象的年龄进行排序****************************************************************
        //o是已经存的
        int result = o.age - this.age;
        //result是负数，则把该元素放到左边
        //result是0，表示重复不添加，即使名字不一样也认为重复不添加
        //年龄一样则再比较姓名
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        //this.name.compareTo是字符串的方法，按照首字母进行比较
        return result;
    }
}
