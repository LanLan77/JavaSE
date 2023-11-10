package com.alan.d7_interface;

/*
*   认识接口
        •Java提供了一个关键宇interface，用这个关键字我们可以定义出一个特殊的结构：接口。

    public interface 接口名{
        //成员变量（常量）
        //成员方法（抽象方法）

        •注意：接口不能创建对象；接口是用来被类实现(implements）的，实现接口的类称为实现类。
        修饰符class 实现类 implements 接口1，接口2，接口3，⋯

     一个类可以实现多个接口（接口可以理解成干爹），实现类实现多个接口，必须重号完全部接口的全部抽象方法，否则实现类需要定义成抽象类。

* */

public class Test {
    // 目标：认识接口
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME );
    }


}
