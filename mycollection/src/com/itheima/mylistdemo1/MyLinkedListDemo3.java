package com.itheima.mylistdemo1;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo3 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("-------------------");

        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------------------");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }


    }
}



























