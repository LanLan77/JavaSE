package com.alan.d2_static_method;

public class Test  {
    // 目标： 掌握有无static修饰方法的用法

/*
*   1. static修饰的成员方 配套资源领取、课程咨询可直接私信
        •类方法（静态方法）
        •属于类，可以直接用类名访问，也可以用对象访问

        * 类名.类方法(推荐）
        * 对象名.类方法(不推荐）

*   2. 无static修饰的成员方法叫什么？ 如何使用？
        •实例方法(对象的方法）
        •对象.实例方法
        属于对象，只能用对象访问
*
* */
    public static void main(String[] args) {
        // 1. 类方法的使用
        // 类名.类方法 (推荐)
        Student.printHelloWorld();


        // 对象.类方法（不推荐）
        Student s = new Student();
        s.printHelloWorld();


        // 2. 实例对象的方法
        s.printPass();  //对象.实例方法
        //Student.printPass();  报错




    }


}
