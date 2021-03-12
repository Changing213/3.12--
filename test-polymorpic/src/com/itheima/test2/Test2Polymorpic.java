package com.itheima.test2;

public class Test2Polymorpic {
    /*
   多态的成员访问特点；
            成员变量：编译期间看左边（父类），运行时看的也是左边（父类）

            成员方法：编译期间看左边（父类），运行时看的是右边（子类）


     */
    public static void main(String[] args) {
        //要有父类引用指向子类对象
        Fu f = new Zi();
        System.out.println(f.num);
        //多态创建对象调用成员变量时，走的是父类的成员变量
        f.method();
    }

}

class Fu {
    int num = 10;

    public void method(){
        System.out.println("Fu..method");
    }
}

class Zi extends Fu{
    int num = 20;
    //多态的前提是继承或实现关系和方法重写
    public void method(){
        System.out.println("Zi..method");
    }
}
