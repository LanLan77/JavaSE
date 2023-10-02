package com.alan.polymorphism;

public class Test {
    // 目标：认识多态，对象多态，行为多肽
    /*
    *   什么是多态：
    *       多态是继承和实现情况下的一种现象，表现为：对象多态，行为多态
    *   多态的代码实现：
    *       People p1 = new Teacher();
            p1.run();   // 识别技巧：编译看左边，运行看右边
            People p2 = new Student();
            p2.run();   // 识别技巧：编译看左边，运行看右边
    *   多态的前提：
    *       有继承实现关系，存在父类引用子类对象，存在方法重写
    *   多态的一个注意事项
    *       多态的对象，行为的多态，java中的属性（成员变量）不谈多肽
    *
    * */
    public static void main(String[] args) {
        // 1. 对象多态
        People p1 = new Teacher();
        p1.run();   // 识别技巧：编译看左边，运行看右边
        System.out.println(p1.name);
        People p2 = new Student();
        p2.run();   // 识别技巧：编译看左边，运行看右边
        System.out.println(p2.name);
    }
}
