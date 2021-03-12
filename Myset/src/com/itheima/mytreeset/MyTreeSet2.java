package com.itheima.mytreeset;

import java.util.TreeSet;

/*
           TreeSet集合用于存储Student类型
 */
public class MyTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> st = new TreeSet<>();
        Student s4 = new Student("小梦",15);
        Student s1 = new Student("小伊",11);
        Student s5 = new Student("小猪",19);

        Student s6 = new Student("小真",20);
        Student s2 = new Student("小涵",12);
        Student s3 = new Student("小佳",13);
        Student s7 = new Student("小花",19);


        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);

        System.out.println(st);//错
        //想要使用TreeSet必须制定排序规则


        /*
        一个类只要实现了Comparable接口，那么该类的元素就可以根据compareTo的返回值对元素进行排序
         */



    }





}
