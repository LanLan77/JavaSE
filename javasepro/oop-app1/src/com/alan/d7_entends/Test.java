package com.alan.d7_entends;
/*      1、什么是继承？继承后有啥特点？
             •继承就是用extends关键字，让一个类和另一个类建立起一种父子关系。
             •子类可以继承父类非私有的成员。
        2、带继承关系的类，Java会怎么创建它的对象？对象创建出来后，可以直接访问哪些成员？
             •带继承关系的类，java会用类和其父类，这多张设计国来一起创建类的对象。
             •对象能直接访问什么成员，是由子父类这多张设计图共同决定的，这多张设计图对外暴露了什么
              成员，对象就可以访问什么成员。
*/

public class Test {
    public static void main(String[] args) {
        // 目标： 认识继承，掌握继承的特点

        B b = new B();
        System.out.println(b.i);
        // System.out.println(b.j);
    }
}
