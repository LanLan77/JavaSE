package com.alan.d10_interface_JDK8;
/*
* 1、JDK8开始，接口中新增了哪些方法？
    •默认方法：使用default修饰，使用实现类的对象调用。
    •静态方法：static修饰，必须用当前接口名调用
    •私有方法：private修饰，jdk9开始才有的，只能在接口内部被调用。
    •他们都会默认被public修饰。
  2、JDK8开始，接口中为啥要新增这些方法？
    •增强了接口的能力，更便于项目的扩展和维护。
* */
public class Test {
    public static void main(String[] args) {
        // 目标：掌握接口新增的三种形式
        B b = new B();
        b.test1();
    }
}
