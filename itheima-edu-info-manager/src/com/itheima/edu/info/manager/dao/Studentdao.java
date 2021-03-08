package com.itheima.edu.info.manager.dao;
//数据的增删改查，库管

import com.itheima.edu.info.manager.domain.Student;

public class Studentdao {
    //外类不得访问
    //加上static变成静态共享数组
    private static Student[] stus = new Student[5];
    public boolean addStudent(Student stu) {

        //创建一个学生对象数组
        //添加学生到数组
        //定义变量index=-1，假设数组已经全部储存，没有null的元素
        //遍历数组取出每一个元素，判断是否是null
        //如果是null，让index变量记录当前索引位置，并使用break结束循环遍历。
        //返回是否添加成功的Boolean类型状态


        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stus1 = stus[i];
            if(stus1 == null){
                index = i;
                break;//结束遍历
            }
        }
        if(index == -1){
            return false;
        }
        else {
            stus[index] =stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public void delStudentById(String delId) {
        //查找id在容器中所在的索引位置
        //将该索引位置，使用null元素进行覆盖
        int index = getIndex(delId);
        stus[index] = null;


    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = Studentdao.stus[i];
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;

    }


    public void updateStudent(String upId, Student newStu) {
        //查找upId在容器中的索引位置
        //将该索引位置使用心得学生对象进行替换
        int index = getIndex(upId);
        stus[index] = newStu;


    }
}
