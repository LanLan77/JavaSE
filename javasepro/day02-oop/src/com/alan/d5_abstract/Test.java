package com.alan.d5_abstract;

import com.alan.d4_abstract.A;

// 目标：掌握抽象类的好处
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.setName("小猫");
        dog.setName("小狗 ");

        cat.cry();
        dog.cry();
    }
}
