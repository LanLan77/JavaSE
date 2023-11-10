package com.alan.d6_abstract_template;
/*  1、模板方法设计模式解决了什么问题？
        •解决方法中存在重复代码的问题。
    2、模板方法设计模式应该怎么写？
        •定义一个抽象类。
        •在里面定义2个方法，一个是模板方法：放相同的代码里，一个是抽象方法：具体实现交给子类完成。
    3、模板方法建议使用什么关键宇修饰？为什么
        •建议使用final关键字修饰模板方法。
*/
public abstract class People {
    /*
    * 设计模板方法设计模式：
    * 1. 定义一个模板方法出来
    *
    * */


    public final void write() {
        System.out.println("\t\t\t\t\t\t《我的爸爸》");
        System.out.println("\t\t 这是我的爸爸真牛逼啊");

        // 2. 模板方法并不清楚正文部分到底怎么写，但他知道子类一定要写
        System.out.println(writeMain());

        System.out.println("有这样的爸爸太好了");
    }

    // 设计一个抽象方法写正文，具体实现交给子类来完成
     public abstract String writeMain();
}
