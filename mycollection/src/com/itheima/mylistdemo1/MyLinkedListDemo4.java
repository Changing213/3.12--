package com.itheima.mylistdemo1;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo4 {

    public static void main(String[] args) {


        /*
            public void addFirst (E e) 在该列表开头插入指定的元素

            public void addLast (E e) 在该列表末尾追加指定的元素

            public E getFirst ()  返回此列表的第一个元素

            public E getLast ()  返回此列表的最后一个元素

            public E removeFirst（） 从此列表中删除并返回第一个元素

            public E removeLast（） 从此列表中删除并返回最后一个元素

         */
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //method1(list);
       // method2(list);


//88888888888888888888888888888888888888888888888888888888888888

    }

    private static void method2(LinkedList<String> list) {
        //public void addLast (E e) 在该列表末尾追加指定的元素
        list.addLast("WWW");
        System.out.println(list);
    }

    private static void method1(LinkedList<String> list) {
        //public void addFirst (E e) 在该列表开头插入指定的元素
        list.addFirst("qqq");
        System.out.println(list);
    }
}



























