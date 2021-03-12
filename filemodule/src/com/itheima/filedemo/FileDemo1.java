package com.itheima.filedemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //method1();
        method2();

        method3();
    }

    private static void method3() {
        //File (File parent,String child)  从父抽象路径名和子路径名字符串创建新的File实例
        File file1 = new File("D:\\itheima");
        String path = "a.txt";    
        File file = new File(file1,path);
        System.out.println(file);
    }


    private static void method2() {
        //File(String parent,String child）从父路径名字符串和子路径名字符串创建新的File实例
        String path1 = "D:\\itheima";
        String path2 = "a.txt";
        File file = new File(path1,path2);//把两个路径进行拼接
        System.out.println(file);
    }

    private static void method1() {
        //File (String pathname)    通过将给定的路径名字符串 转换为抽象路径名来创建新的File实例
        String path = "D:\\itheima\\a.txt";
        File file = new File(path);
        System.out.println(file);
        //为什么要把字符串表示形式的路径变成File对象？
        //就是为了使用File类里面方法
    }

}
