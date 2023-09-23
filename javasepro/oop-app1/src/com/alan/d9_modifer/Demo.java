package com.alan.d9_modifer;

public class Demo {
    // 目标：掌握不同权限修饰符的作用
    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
