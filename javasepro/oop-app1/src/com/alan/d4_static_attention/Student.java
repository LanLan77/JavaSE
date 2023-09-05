package com.alan.d4_static_attention;

public class Student {
    static String schoolName;   // 类变量
    double score; // 实例变量

    // 1. 类方法中可以直接访园类的成员。不可以直接访阿实例成员。
    public static void printHelloWorld(){
        // 注意：在同一个类中，可以省略类名不写
        schoolName = "黑马";
        printHelloWorld();

        // System.out.println(score);   类方法不能访问实例变量
        // printPass();                 类方法不能访问实例方法
        // System.out.println(this);    类方法不能使用this
    }

    // 类方法
    public static void printHelloWorld2(){
        System.out.println("printHelloWorld2 ");
    }


    // 2. 实例方法中既可以直按访向类成员，也可以直按访问实例成员。
    // 实例方法
    // 3. 实例方法中可以出现th1s关键字，类方法中不可以出现th1s关键字的
    public void printPass(){
        schoolName = "黑马2";
        printHelloWorld2();

        System.out.println(score );
        this.printPass2();

        System.out.println(this);
    }


    public void printPass2(){
        schoolName = "黑马2";
        printHelloWorld2();

        System.out.println(score);
    }
}
