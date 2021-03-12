package com.itheima.test4;

import java.util.Random;

public class RandomNumHandlerDemo {
    /*
            1.首先在一个接口（RandomNumHandler)
            2.在该接口中中存在一个抽象方法（getNumber）。该方法无参数有返回值
            3.在测试类（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler)
                       方法的参数是RandomNumHandler类型的
                       在方法内部调用了RandomNumHandler的getNumber方法

     */
    public static void main(String[] args) {
        //匿名内部类调用
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                //重写getNumber,产生随机数
                Random r = new Random();
                int num = r.nextInt(10) + 1;//1-10之间的随机数
                return num;
            }
        });


        //Lambda实现

        useRandomNumHandler(() -> {
            Random r = new Random();
            int num = r.nextInt(10) + 1;//1-10之间的随机数
            return num;//如果Lambda表达语句操作的接口中的方法是有返回值的，
            // 就一定要编写return语句，把这个结果返回出去，否则编译错误
        });





    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int result = randomNumHandler.getNumber();
        System.out.println(result);
    }


}

interface RandomNumHandler{
    int getNumber();
}
