package com.itheima.test3;

public class Test3Polymorphic {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        useDog(d);
        useDog(new Dog());
        useCat(new Cat());
    }

    public static void useDog(Dog dog){
        dog.eat();
    }
    public static void useCat(Cat cat){
        cat.eat();
    }
}


abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}