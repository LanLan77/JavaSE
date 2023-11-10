package com.alan.d4_abstract;
//抽象类
public abstract class A {
    //抽象方法 必须用abstract修饰，只有方法签名， 不能有方法体

    /*
    * 抽象类的注意事项、特点
        •抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类。
        •类该有的成员（成员变量、方法、构造器） 抽象类都可以有。
        •抽象类最主要的特点：抽象类不能创建对象，仅作为一种特殊的父类，让子类继承并实现。
        •一个类维承抽象类，必续重写完抽款关的全部抽象方法，否则这个类也必领定义成抽象类。
    * */

    private String name;
    private static String SCHOOL_NAME;
    public abstract void run();
}
