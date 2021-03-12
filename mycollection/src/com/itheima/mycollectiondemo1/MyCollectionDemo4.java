package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollectionDemo4 {
    public static void main(String[] args) {
       // Collection<String> List = new ArrayList<>();
        //一般不用多态来定义集合
        ArrayList<String> List = new ArrayList<>();
        List.add("a");
        List.add("b");
        List.add("b");
        List.add("d");
        List.add("e");

        for (int i = 0; i < List.size(); i++) {
            String s = List.get(i);
            if("b".equals(s)){
                List.remove(i);//删除之后，集合长度自动减1
                i--;//这一步必不可少
            }
        }
        System.out.println(List);

    }

}














