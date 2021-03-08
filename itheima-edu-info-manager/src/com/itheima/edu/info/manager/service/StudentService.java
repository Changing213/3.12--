package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.Studentdao;
import com.itheima.edu.info.manager.domain.Student;

//业务员 业务的逻辑处理
public class StudentService {
   private Studentdao stud = new Studentdao();
    public boolean addStudent(Student stu) {
        //创建一个库管对象Studentdao
        //将学生对象，传递给Studentdao库管中的addStudent方法
        //将返回的Boolean类型结果返回给StudentController


        return stud.addStudent(stu);


    }

    public boolean isExists(String id) {

        Student[] array = stud.findAllStudent();
        //假设id在数组中不存在
        boolean exists = false;
        for (int i = 0; i < array.length; i++) {
            Student student = array[i];
            //取出来的数组元素可能是null，要先判断
            if(student != null && student.getId().equals(id)){
                exists = true;
                break;
            }

        }
        return exists;

    }

    public Student[] findAllStudent() {
        //调用库管对象的findAllStudent获取学生对象数组
        //判断数组中是否有学生信息（有：返回地址，  没有：返回null）
        Student[] allStudent = stud.findAllStudent();
        //数组中只要存在一个不是null的元素，那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if(stu != null)
            {
                flag = true;
                break;
            }
        }
        if (flag){
            return allStudent;
        }else {
            return null;
        }

        }

    public void delStudentById(String delId) {
        stud.delStudentById(delId);
    }

    public void updateStudent(String upId, Student newStu) {
        stud.updateStudent(upId,newStu);

    }
}
