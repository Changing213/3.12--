package com.itheima.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo2 {

    public static void main(String[] args) {
     //先创建集合的对象,不能new Collection ，接口不能直接new，只能new他的实现类
        Collection<String> collection = new ArrayList<>();
        method(collection);
        method1(collection);

        method2(collection);

     //   method3(collection);
        method4(collection);
        method5(collection);
        method6(collection);
    }

    private static void method6(Collection<String> collection) {
        //7.集合的长度，也就是集合中元素的个数  int size()
        int size = collection.size();
        System.out.println(size);
    }

    private static void method5(Collection<String> collection) {
        //6.判断集合是否为空，boolean isEmpty（）；
        boolean e = collection.isEmpty();
        System.out.println(e);
    }


    private static void method4(Collection<String> collection) {
        //5.判断集合中是否存在指定的元素 boolean contains(Object o)
        boolean result = collection.contains("a");
        System.out.println(result);
    }

    private static void method3(Collection<String> collection) {
        //4.清空 void clear
        collection.clear();
        System.out.println(collection);
    }

    private static void method(Collection<String> collection) {
        //1.添加元素方法,boolean add(E e);
        boolean a = collection.add("aaa");
        collection.add("aaa");
        collection.add("aaa");
        collection.add("aaaa");
        System.out.println(collection);
        System.out.println(a);
    }

    private static void method1(Collection<String> collection) {
        //2.删除方法boolean remove(Object o);
        boolean result = collection.remove("aaa");//只会删除一个
        boolean result2 = collection.remove("sss");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(collection);
    }

    private static void method2(Collection<String> collection) {
        //3.根据条件删除Boolean removeif（Object o）
        /*
                removeif底层会遍历集合，得到集合中的每一个元素
                s依次表示集合中的每一个元素
                就会把这每一个元素都到Lambda表达式中去判断一下
                如果返回的是true，则删除
                如果返回的是false，则保留

         */


        collection.removeIf(
                (String s) -> {
                    return s.length() == 3;
                }
        );//一下子删除全部长度为三的元素
        System.out.println(collection);
    }
}
