package com.alan.d2_inner_class2;
/*
* 1.什么是静态内部类？如何创建对象？ 有啥特点？
    •有static修饰的内部类。
    •外部类名•内部类名 对象名二new 外部类.内部类(⋯）；
    •可以直接访问外部类的静态成员，不能直接访问外部类的实例成员。
* */

// 目标：了解目标静态类
public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.test();
    }
}
