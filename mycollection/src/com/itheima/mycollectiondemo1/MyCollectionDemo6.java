package com.itheima.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectionDemo6 {
    public static void main(String[] args) {

        //Collection继承了Iterable接口，单列集合都可以使用迭代器和增强for
        //Map没有继承Iterable接口，双列集合不可使用迭代器和增强for
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
            //单列集合或者数组可用
        for(String str : list){
            System.out.println(str);

        }

    }

}














