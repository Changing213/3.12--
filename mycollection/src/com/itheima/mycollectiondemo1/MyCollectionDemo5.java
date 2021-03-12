package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectionDemo5 {
    public static void main(String[] args) {
       // Collection<String> List = new ArrayList<>();
        //一般不用多态来定义集合
        ArrayList<String> List = new ArrayList<>();
        List.add("a");
        List.add("b");
        List.add("b");
        List.add("d");
        List.add("e");

        //迭代器的方式进行删除
        Iterator<String> it = List.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                it.remove();
            }
        }
        System.out.println(List);
    }

}














