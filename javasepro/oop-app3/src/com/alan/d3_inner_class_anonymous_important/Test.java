package com.alan.d3_inner_class_anonymous_important;

public class Test {
    public static void main(String[] args) {
        // 目标：认识匿名内部类『重要』，掌握其作用
//        Animal animal = new Cat();
//        animal.cry();
//    }

        // 1. 把这个匿名内部类编译成一个子类，然后会立即创建出一个子类的对象来
        Animal a =  new Animal(){

            @Override
            public void cry() {
                System.out.println("喵喵喵的叫");
            }
        };
        a.cry();
}

//class Cat extends Animal{
//
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵 ");
//    }
//}
abstract static class Animal {
    public abstract void cry();
}
}
