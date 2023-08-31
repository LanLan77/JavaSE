package com.alan.d1_staticdemo;

public class Test {
    /*
    *  1. static 是什么？
    *     * 叫静态，可以修饰成员变量，成员方法
    *  2. static 修饰的成员变量叫什么？ 怎么使用？ 有何特点
    *     * 类变量（静态成员变量）
    *       类名.类变量（推荐）
    *       对象名.类变量（推荐）
    * */
    public static void main(String[] args) {
         // 目标：掌握有无static成员变量的用法，特点

        // 1. 类变量的用法
        // 类名.变量名（推荐）
        Student.name = "袁华";

        // 对象.变量名(不推荐 )
        Student s1 = new Student();
        s1.name = "马冬梅";

        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.name);


        // 2. 实例变量的用法，属于每个对象的变量
        // 对象.变量
        s1.age = 18;
        s2.age = 23;
        System.out.println(s1.age);
        System.out.println(s2.age);

    }
}
