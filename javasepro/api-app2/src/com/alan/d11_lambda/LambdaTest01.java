package com.alan.d11_lambda;
/*
*   Lambda表达式：
*       * Lambda表达式是一种语法形式
*       * 用于简化匿名内部类的代码写法
*       注意：Lambda表达式只能简化函数式接口的匿名内部类
*
*       格式：
*           (被重写方法的形参列表) -> {
*               被重新方法体代码
*           }
*
*
*   Lambda表达式的省略写法(进一步简化Lambda表达式的写法）
        •参数类型可以省略不写。
        •如果只有一个参数，参数类型可以省略，同时(也可以省路。
        •如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！此时，如果这行代码是return语句，也必须去掉return不写。
* */

public class LambdaTest01 {
    public static void main(String[] args) {
        // 目标: 认识Lambda表达式
//        Animal animal = new Animal(){
//            @Override
//            public void run() {
//                System.out.println("狗跑的贼快  ");
//            }
//        };


        // 注意：Lambda表达式并不是说能简化全部匿名内部类的写法，只能简化函数式的接口匿名内部类
        //   错误的代码
//        Animal animal = () -> {
//            System.out.println("狗跑的贼快  ");
//        }
//

       /* Swimming swimming =   new Swimming(){
            @Override
            public void swim() {
                System.out.println("学生快乐的游泳 ");
            }
        };

        swimming.swim();  */

        Swimming swimming = () -> {
            System.out.println("学生快乐的游泳 ");
        };

        swimming.swim();
    }
}


interface Swimming{
    void swim();
}

abstract class Animal {
    public abstract void run();
}
