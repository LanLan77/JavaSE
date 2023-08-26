package com.alan.constructor;

public class Student {
    String name;
    double score;

    // 无参构造器
    public Student(){
        System.out.println("这是无参构造器");
    }

    public Student(String name, double score){
        this.name = name;
        this.score = score;
        System.out.println("这是有参构造器");
    }

}
