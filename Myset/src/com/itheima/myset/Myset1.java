package com.itheima.myset;

/*

    Set集合的基本使用
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Myset1 {
    public static void main(String[] args) {
        //Set是接口，要用她的实现类去new
        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("aaa");
        set.add("aaa");//只留下了一个aaa
        set.add("bbb");


        //Set集合没有索引，没有普通for方法

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("******************************");

        for (String s : set) {
            System.out.println(s);
        }

    }

}
