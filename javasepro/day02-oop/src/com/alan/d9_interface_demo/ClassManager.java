package com.alan.d9_interface_demo;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students = new ArrayList<>();
    private StudentOperater studentOperater = new StudentOperaterImple2();

    public ClassManager(){
        Student s1 = new Student("迪丽热巴",'女',99);
        students.add(s1);
        Student s2 = new Student("古力娜扎",'女',100 );
        students.add(s2);
        Student s3 = new Student("马尔扎哈",'女',60 );
        students.add(s3);
        Student s4 = new Student("卡布奇诺",'男',20 );
        students.add(s4);
    }

    // 打印全班所有学生信息
    public void printInfo(){
        studentOperater.printAllInfo(students);
    }

    // 打印全班所有学生平均分
    public void printScore(){
        studentOperater.printAverageScore(students );
    }
}
