package com.alan.d14_extends_constructor;

// 目标：认识子类构造器特点

/*
*   子类构造器的特点：
        •子类的全部构造器，都会先调用父类的构造器，再执行自己。
    子类构造器是如何实现调用父类构造器的：
        •默认情况下，子类全部构造器的第一行代码都是super(） （写不写都有），它会调用父类的无参数构造器。
        •如果父类没有无参数构造器，则我们必须在子类构造器的第一行手写super(……)，指定去调用父类的有参数构造器。
* */
class Father {
    public Father(){
        System.out.println("父类无参构造器执行了");
    }
}

class Child extends Father{
    public Child(){
        super(); // 默认存在
        System.out.println("子类无参构造器执行了");
    }

    public Child(String name){
        super(); // 默认存在
        System.out.println("子类有参构造器执行了");
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        Child child2 = new Child("王小美 ");
    }
}
