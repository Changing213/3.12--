package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;


/*
           创建一个Collection存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合。

           1.定义学生类
           2.创建Collection集合对象
           2.创建学生对象
           3.把学生添加到集合
           4.遍历集合（Iterater）

 */

public class MyCollectionDemo8 {
    public static void main(String[] args) {
        //Collection是个接口不能直接创建，使用它的实现类
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("钱晋同学",23);
        Student s2 = new Student("姜梦奇同学",22);
        Student s3 = new Student("小松同学",12);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器
        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
        //增强for
            for (Student s : list) {
                System.out.println(s);
            }


        }


    }














