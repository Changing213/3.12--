package com.itheima.test1;

public abstract class Animal {
    //父类中要编写共性的内容
    public void drink(){
        System.out.println("喝水");

    }
    //这个方法被抽取到父类之后描述不清了，应当定义为抽象方法
    public abstract void eat();
}
