package com.itheima.mytreeset;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MytreeSet4 {
    public static void main(String[] args) {

        TreeSet<Teacher> tr = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1是要存的元素，02是已经存入的元素
                int result = o1.getAge() - o2.getAge();


                //年龄还相同就拿姓名比
                result = result == 0 ? o1.getName().compareTo(o2.getName()) :result;
                return result;
            }
        });




        Teacher t1 = new Teacher("chenggui",23);
        Teacher t2 = new Teacher("chenghongxia",46);
        Teacher t3 = new Teacher("fangdongxia",48);
        Teacher t4 = new Teacher("wuchunfen",52);
        Teacher t5 = new Teacher("chenchongyang",57);
        Teacher t6 = new Teacher("chenshufen",26);
        Teacher t7 = new Teacher("qianjiuhong",29);
        Teacher t8 = new Teacher("wangzhongbing", 46);
        Teacher t9 = new Teacher("lizhixiong",38);
        Teacher t10 = new Teacher("hongguibing",49);
        Teacher t11 = new Teacher("caishengbing",41);
        Teacher t12 = new Teacher("liaoxiaoxian",31);

        tr.add(t1);
        tr.add(t2);
        tr.add(t3);
        tr.add(t4);
        tr.add(t5);
        tr.add(t6);
        tr.add(t7);
        tr.add(t8);
        tr.add(t9);
        tr.add(t10);
        tr.add(t11);
        tr.add(t12);

        System.out.println(tr);








    }

}
