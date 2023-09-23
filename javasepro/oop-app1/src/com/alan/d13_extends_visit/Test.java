package com.alan.d13_extends_visit;

import com.alan.d11_extend_feature.C;

/*  1.在子类方法中访问其他成员（成员变量、成员方法），是依照就近原则的。
        •先子类局部范国找。
        •然后子类成员范围找。
        •然后父类成员范围找，如果父类范国还没有找到则报错。
    2、如果子父类中，出现了重名的成员，会优先使用子类的，如果此时一定要在子类中使用父类的怎么办？
        •可以通过super关键字，指定访问父类的成员：super.父类成员变量/父类成员方法
* */
public class Test {
    // 目标：掌握子类中访问其他成员的特点：就近原则

    public static void main(String[] args) {
        Child child = new Child();
        child.showName();
        child.showMethod();
    }

}
