package com.alan.d6_abstract_template;
// 目标：搞清楚抽象类的应用场景之一，经常用来设计模板方法模式
public class Test  {
    public static void main(String[] args) {

    //场景：学生老师都要写作文：我的爸爸。开头结尾一样，中间正文不一样
        Teacher teacher = new Teacher();
        teacher.write();

    }
}
