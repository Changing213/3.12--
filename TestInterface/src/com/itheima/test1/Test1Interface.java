package com.itheima.test1;

public class Test1Interface {
    /*

    接口的定义格式：
    public interface 接口名（）

    实现接口的格式：
    public class 类名 implements 接口名（）


     */
    public static void main(String[] args) {
       // inter i = new inter();接口不允许创建对象
        //创建接口的实现类的对象
        InterImpl ii = new InterImpl();
        ii.study();


    }
}


