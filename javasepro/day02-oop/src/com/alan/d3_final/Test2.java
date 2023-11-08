package com.alan.d3_final;
/*
* 常量
•使用了static final 修饰的成员变量就被称为第量；
•作用：通常用于记录系统的配置信息。

注魚！常量名的命名规范：建议使用大号英文单词，多个单调使用下划线连按起来。
使用常量记录系統配置信息的优势、执行原理
•代码可读性更好，可维护性也更好。
•程序编译后，第量会被 “宏替換〞：出现常量的地方全部会被替换成其记佳的字面量
这样可以保证使用常量和直接用宇面量的性能是一样的。
* */
public class Test2 {
    public static final String SCHOOL_NAME = "常量";
    public static void main(String[] args) {
        // 目标：认识常量
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
    }
}
