package com.itheima.test4;

public class Test4Polymorpic {
    public static void main(String[] args) {
        //向上转型，父类引用只想子类对象
        Fu f = new Zi();
        f.show();
        //f.method();///子类特有不能直接调用，编译会直接报错
        //非要调用，直接创建子类对象
        //或者 向下 转型
        //从父类转换为子类
        Zi z = (Fu)f;//强制类型转换
        z.method();

    }

}

class Fu{
    public void show(){
        System.out.println("Fu..show...");
    }
}
class Zi extends Fu{
    @Override
    public void show() {
        System.out.println("Zi..show...");
    }
    public void method(){
        System.out.println("我是子类特有的方法，method");
    }
}