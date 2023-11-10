package com.alan.d8_interface2;

/*
*   1、使用接口有啥好处，第一个好处是什么？
        •可以解决类单继承的问题，通过接口，我们可以让一个类有一个亲蓄的同时，还可以找多个干爹去扩展自己的功能。
    2、为什么我们要通过接口，也就是去找干爹，来扩展自己的功能呢？
        •因为通过接口去找干整，别人通过你implements的接口，就可以显性的知道你是谁，从而也就可以放心的把你当作谁来用了。
    3、使用接口的第二个好处是什么？
        •一个类我们说可以实现多个接口，同样，一个接口也可以被多个类实现的。这样做的好处是我们的程序就可以面向接口编程了，这样我们程序员就可以很方便的灵活切换各种业务实现了。
*
* */

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚使用接口的好处
        //Student a = new A();
        Driver a = new A();

        // Driver d = new A();
        Driver d = new B();
        d.drive();
    }
}

class A extends Student implements Driver, Singer {

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class B implements Driver{

    @Override
    public void drive() {

    }
}
class Student{

}

interface Driver{
    //成员方法（抽象方法）
    void drive();
}

interface Singer{
    //成员方法（抽象方法）
    void sing();
}