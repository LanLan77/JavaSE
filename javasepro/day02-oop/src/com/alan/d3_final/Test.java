package com.alan.d3_final;
/*
final
•final 关键字是最终的意思，可以修饰（类、方法、变量）
•修饰类：该类被称为最终类，特点是不能被继承了。
•修饰方法：该方法被称为最终方法，特点是不能被重写了。
•修饰变量：该变量只能被赋值一次。
final修饰变量的注意
•final修饰基本类型的变量，变量存储的数据不能被改变。
•final修饰引用类型的变量，变量存储的地址不能被改变，但地址所指向对象的内容是可以被改变的。
* */

public class Test {
    //常量：public static final String schoolName，建议名称全部大写，多个单词下划线连接
    public static final String SCHOOL_NAME   = "哈尔滨佛学院";
    public static void main(String[] args) {
        // 目标：认识final的作用
        // 3.final 可以修饰变量，有且仅能赋值一次
        //      变量：
        //          一 局部变量
        //          二 成员变量
        //              1. 静态成员变量
        //              2. 实例成员变量

        final int[] arr = {11,22,33};
        //arr = null        final修饰的地址不能变
        arr[1] = 44;

        final int a;
        a = 10;
        //a = 13; 第二次赋值 出错

        final double pi = 3.14;
        // pi = 23321;

    }

    public static void buy(final double z){
        // z = 0.2 第二次赋值 出错
    }

}

// 1. final 修饰类，类就不能被继承了(工具类)
final class A{}
//class B extends A{}

// 2. final 修饰方法，方法不能被重写
 class C{
    public final void test(){

    }
}

class D extends C{
//    @Override
//    public final void test(){
//
//    }
}

