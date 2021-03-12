package com.itheima.mytreeset;
/*
           TreeSet集合来存储Integer类型
 */


import java.util.TreeSet;

public class mytreeset {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(1);

        System.out.println(ts);

        //TreeSet不能保证存和取的顺序，但是可以对内部的元素进行排序



    }



}
