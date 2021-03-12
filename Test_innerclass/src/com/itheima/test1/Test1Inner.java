package com.itheima.test1;

public class Test1Inner {

    public static void main(String[] args) {

        /*


         */
        Outer.Inner i = new Outer().new Inner();
    }
}

class Outer{
    class Inner{
        int num = 10;


        public void show(){
            System.out.println("Inner...show");
        }
    }
}

class Outer{

}