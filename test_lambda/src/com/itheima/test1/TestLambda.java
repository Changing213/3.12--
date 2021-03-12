package com.itheima.test1;

public class TestLambda {

        /*
                lambda表达式的使用前提
                1 一个接口
                2 接口中有且仅有一个抽象方法

                练习：
                1 编写一个接口（ShowHandler）
                2 在该接口中存在一个抽象方法（show），该方法是无参数无返回值
                3 在测试类（ShowHandlerDemo)  中存在一个方法（useShowHandler)
                        方法的参数是ShowHandler类型的
                        在方法内部通过接口调用了ShowHandler的方法


         */
    public static void main(String[] args) {
        //匿名内部类调用方法
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });

        //Lambda实现
        useShowHandler(()->{System.out.println("我是lambda中的show方法");});

    }
    public static void useShowHandler(ShowHandler showHandler){
        showHandler.show();

    }

}

interface ShowHandler{
    void show();
}
