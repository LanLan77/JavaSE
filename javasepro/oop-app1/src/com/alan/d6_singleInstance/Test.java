package com.alan.d6_singleInstance;

/*  什么是设计模式 (Design pattern)?
        * 一个问题通常有n种解法，其中肯定有一种解法是最优的，这个最优的解法被人总结出来了，称之为设计模式。
        * 设计模式有20多种，对应20多种软件开发中会遇到的问题。
    关于设计模式的学习，主要学什么？
        1. 解决什么问题？
        2. 怎么写？

    单例设计模式
        •确保一个类只有一个对象。
      写法
        * 把类的构造器私有。
        * 定义一个类变量记住类的一个对象。
        * 定义一个类方法，返回对象。
*/

public class Test {

    public static void main(String[] args) {
        //目标：掌握单例模式设计的写法

        //new A(); 报错
        A a1 = A.getObject();
        A a2 = A.getObject();
    }

}
