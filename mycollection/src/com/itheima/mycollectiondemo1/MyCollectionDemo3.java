package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> List = new ArrayList<>();
        List.add("a");
        List.add("b");
        List.add("b");
        List.add("d");
        List.add("e");
        //使用迭代器遍历集合
        //1.获取迭代器的对象，迭代器一旦被创建出来，默认指向集合的0索引处
        Iterator<String> it = List.iterator();//返回值就是我们的迭代器对象，迭代器的泛型和集合的泛型保持一致

        //2.利用迭代器里面的方法进行遍历

        //hasNext方法用于判断当前的位置有没有元素可以取出，返回值是boolean
//        System.out.println(it.hasNext());
//        //next方法用于取出当前位置的元素，返回值是元素，然后迭代器往后移动一个索引的位置
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

            while(it.hasNext()){
                System.out.println(it.next());
            }
    }

}














