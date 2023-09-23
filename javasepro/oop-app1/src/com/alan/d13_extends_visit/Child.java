package com.alan.d13_extends_visit;

public class Child extends Father{
    String name = "子类名字";

    public void showName(){
        String name = "局部名称";
        System.out.println("就近原则："+name);   //就近原则
        System.out.println("当前类："+this.name);
        System.out.println("父类："+super.name);
    }

    @Override
    public void print1(){
        System.out.println("========子类的print1方法========");
    }


    public void showMethod(){
        print1();
        super.print1();
    }
}
