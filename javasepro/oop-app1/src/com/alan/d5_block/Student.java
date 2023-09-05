package com.alan.d5_block;

public class Student {
    static int number;
    static String schoolName;


    //静态代码块
/*      格式：static {}
        特点：类加载时自动执行，由于类只会加载一次，所以静态代码块也只会执行一次。
        作用：完成类的初始化，例如：对类变量的初始化赋值。
*/
    static {
        System.out.println("静态代码块运行了");
        schoolName="黑马";
    }


    /*实例代码块：
        格式：{}
        特点：每次创建对象时，执行实例代码块，并在构造器前执行。
        作用：和构造器一样，都是用来完成对象的初始化的，例如：对实例变量进行初始化赋值。
    */
    {
        System.out.println("实例代码块运行了");
    }

    public Student(){
        System.out.println("无参构造器执行了");
    }

    public Student(String name){
        System.out.println("有参构造器执行了");
    }
}
