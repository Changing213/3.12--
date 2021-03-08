package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import javax.print.DocFlavor;
import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();
    public void start() {



        teacherloop:while (true){
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();

            switch (choice){
                case "1":
                   // System.out.println("添加老师");
                    addTeacher();
                    break;
                case "2":
                    //System.out.println("删除老师");
                    delTeacherById();
                    break;
                case "3":
                    //System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    //System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用 老师管理系统，再见");
                    break teacherloop;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
        }


        }
    }

    private void updateTeacher() {
        String id = inputTeacherId();
        //键盘录入新的老师信息
        Teacher newTeacher = inputTeacherInfo(id);

        //调用业务员的修改方法
        teacherService.updateTeacher(id,newTeacher);
        System.out.println("修改成功");
    }

    public void delTeacherById() {
        String s = inputTeacherId();
        //调用业务员的删除方法，根据id删除老师
        teacherService.delTeacherById(s);
        System.out.println("删除成功");

    }

    public void findAllTeacher() {
       //从业务员中获取老师的对象数组
       Teacher[] teachers = teacherService.findAllTeacher();
        //判断数组中是否有元素
        if(teachers == null){
            System.out.println("差无信息，请添加后重试");
            return;
        }
        //遍历数组，取出元素，并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if(t != null){
                System.out.println(t.getId() + "\t" + t.getName() + "\t" + t.getAge() + "\t\t" + t.getBirth());
            }
        }

    }

    public void addTeacher() {
        String id;
        while(true){
            //接受一个不存在的老师id
            System.out.println("请输入老师的id");
            id = sc.next();
            //判断id是否存在，这块属于业务，应该交给业务员处理
            boolean exists = teacherService.isExists(id);
            if(exists){
                System.out.println("id已存在，请重新输入");

            }else{
                break;
            }
        }
       //接受老师的其他信息
        Teacher t = inputTeacherInfo(id);

        //将封装好的老师对象传递给TeacherService继续完成添加操作
        boolean result = teacherService.addTeacher(t);
        if(result){
            System.out.println("添加成功");
        }else{





        }




    }

    //录入老师id的方法

    public String  inputTeacherId(){
        String id;
        //键盘接受id
        while(true){
            System.out.println("请输入id");
            id = sc.next();

            boolean exists;
            exists = teacherService.isExists(id);
            if(!exists){
                System.out.println("您输入的id不存在，请重新输入");
            }else{
                break;
            }
        }
     return id;
    }

    //录入老师信息，并封装为老师对象的方法
    public Teacher inputTeacherInfo(String id){
        System.out.println("请输入老师的姓名");
        String name = sc.next();
        System.out.println("请输入老师的年龄");
        String age = sc.next();
        System.out.println("请输入老师的生日");
        String birth = sc.next();

        //封装为一个老师对象
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setAge(age);
        t.setBirth(birth);

        return t;
    }
}
