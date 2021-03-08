package com.itheima.edu.info.manager.controller;
//客服接待和用户打交道

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService stus = new StudentService();
    //用来开启学生管理系统，并展示学生管理系统菜单
    public void start() {


//        Scanner sc = new Scanner(System.in);

       studentloop:
       while (true){
           System.out.println("--------欢迎来到 <学生> 管理系统--------");
           System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch(choice){
                case "1":
                    System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    delStudentById();
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用，再见！");
                    //不能再使用system.exit(0),因为这会直接退出整个程序
                    break studentloop;
                default:
                    System.out.println("您输入的信息有错，请重新输入！");
                    break;
            }

        }
    }

    public void updateStudent() {
        String upId;
        while(true){
            System.out.println("请输入您要修改的学生id" +"");
            upId = sc.next();

            boolean exists = stus.isExists(upId);
            if(!exists){
                System.out.println("您输入的id不存在，请重新输入：");

            }else{
                break;
            }
        }
        System.out.println("亲输入学生姓名：");
        String name = sc.next();
        System.out.println("亲输入学生年龄：");
        String age = sc.next();
        System.out.println("亲输入学生生日：");
        String birth = sc.next();

        Student newStu = new Student();
        newStu.setId(upId);
        newStu.setName(name);
        newStu.setAge(age);
        newStu.setBirth(birth);


        stus.updateStudent(upId,newStu);
        System.out.println("修改成功");
    }

    public void delStudentById() {
        //键盘录入要删除的学生id
        //判断id在容器中是否存在，如果不存在，则需要一只录入
        //调用业务员中的delStudentById根据id，删除学生
        //提示删除成功
        String delId;
        while(true){
            System.out.println("请输入您要删除的学生id" +"");
            delId = sc.next();

            boolean exists = stus.isExists(delId);
            if(!exists){
                System.out.println("您输入的id不存在，请重新输入：");

            }else{
                break;
            }
        }
        stus.delStudentById(delId);
        System.out.println("删除成功");

    }

    public void findAllStudent() {
        //调用业务员中的获取方法，得到学生的对象数组
        //判断数组的内存地址是否是null
        //如果是null，查无信息，如果不是null，获取学生信息并打印在控制台。
        Student[] a = stus.findAllStudent();
        if(a == null){
            System.out.println("差五信息");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < a.length; i++) {
            Student stu = a[i];
            if(stu != null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirth());
            }
        }
    }

    public void addStudent() {
        //添加两次也就会被创建两次stus，同时也会创建两个dao，同时也会创建两次对象数组，就被添加到不同的数组容器中

        //键盘接受学生信息
        //将学生信息封装为学生对象
        //将学生对象，传递给StudentService(业务员)中的addStudent方法
        //根据返回的boolean值，在控制台打印成功或失败

        String id;
        //输入id是否有重复，要一直输入
        while(true){
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = stus.isExists(id);
            if(flag){
                System.out.println("学号已经存在，请重新输入");
            }
            else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birth = sc.next();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirth(birth);


        boolean result = stus.addStudent(stu);

        if(result){
            System.out.println("添加成功");
        }
        else {
            System.out.println("添加失败");
        }


    }
}
