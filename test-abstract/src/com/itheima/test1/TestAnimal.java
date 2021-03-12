package com.itheima.test1;

import java.util.concurrent.Callable;

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.drink();

        Cat c = new Cat();
        c.drink();
        c.eat();
        //抽象类不能创建对象


    }

}
