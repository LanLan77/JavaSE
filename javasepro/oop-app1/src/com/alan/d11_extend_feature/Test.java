package com.alan.d11_extend_feature;

public class Test {
    //1、继承相关的两个注意事项？
    //① Java是单继承的：一个类只能继承一个直接父类;Java中的类不支持多继承，但是支持多层继承。
    //② object类是Java中所有类的祖宗。
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}
