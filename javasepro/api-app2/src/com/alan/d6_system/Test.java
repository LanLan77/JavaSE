package com.alan.d6_system;
//目标：了解下system类的常见方法。
public class Test {
    public static void main(String[] args) {

        // 1. public static void exit(int status):
        // 终止当前运行的Java虚拟机。该参数用作状态代码;按照惯例，非零状态代码表示异常终止。
        System.exit(0); // 0代表人为的停止虚拟机

        // 2. public static Long currentTimeMillis:获取当前系统的时间
        // 返回的是Long 类型的时间毫秒值：指的是从1970-1-1 日0:0:0日开始走到此刻的,总的毫秒值，1S = 1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 100000; i++) {
            System.out.println("1");
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2 -time)/1000+"s");
    }
}
