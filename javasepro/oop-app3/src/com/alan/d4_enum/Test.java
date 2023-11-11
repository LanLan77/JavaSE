package com.alan.d4_enum;

import javax.sound.midi.Soundbank;

public class Test {

    // 目标：认识枚举
    public static void main(String[] args) {
        A a1 = A.X;
        System.out.println(a1);

        // 1. 内部类是私有的，不能对外创建对象
        // A a = new A();

        // 2. 枚举类的第一行都是常量，记住的是枚举类的对象
        A a2 = A.Y;

        // 3. 枚举类提供一些额外的API
        A[] as = A.values(); // 拿到全部对象
        System.out.println(a2.getName());
        A a3 = A.valueOf("Y");
        System.out.println(a3.name());// Z
        System.out.println(a3.ordinal()); // 索引

    }
}
