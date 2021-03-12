package com.itheima.mycollectiondemo1;

import java.util.ArrayList;


/*
                        三种循环使用场景

            1.如果需要操作索引，使用普通for
            2.如果需要在遍历的过程中删除元素，用迭代器
            3.如果仅仅想遍历，那么使用增强for



 */

public class MyCollectionDemo7 {
    public static void main(String[] args) {

        //Collection继承了Iterable接口，单列集合都可以使用迭代器和增强for
        //Map没有继承Iterable接口，双列集合不可使用迭代器和增强for，增强for底层是迭代器
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

            //单列集合或者数组可用
        for(String str : list){
            str = "q";

        }
        //list.for是增强for。list.fori是一般for
        System.out.println(list);
        //输出的还都是abcd，不是qqqq
        //str仅仅是第三方变量，不会影响集合中的元素

    }

}














