package com.alan.d7_entends;
// 子类
public class B extends A{
    // 子类可以继承父类的非私有成员

    private int k;
    public void print3(){
        System.out.println(i);
        print1();

        // 子类不可以继承父类的私有成员
//        System.out.println(j);
//        print2();
    }
}
