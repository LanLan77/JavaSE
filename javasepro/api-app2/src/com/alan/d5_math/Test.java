package com.alan.d5_math;
// 目标：掌握常见的Math方法
  public class Test {
    public static void main(String[] args) {
        // 目标：了解下Math类提供的常见方法。
        // 1、public static int abs (int a)：取绝对值（拿到的结果一定是正数）
        System.out.println("1. 绝对值");
        System.out.println(Math.abs(-12));
        System.out.println(Math.abs(12));

        // public static double abs(double a)
        System.out.println(Math.abs(-13.3123));
        System.out.println(Math.abs(12.123321 ));
        System.out.println("----------------------");


        // 2. public static double ceil(double a) ： 向上取整
        System.out.println("2. 向上取整");
        System.out.println(Math.ceil(4.0000000001));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(12.123321 ));
        System.out.println("----------------------");

        // 3. public static double floor(double a)：向下取整
        System.out.println("3. 向下取整");
        System.out.println(Math.ceil(4.0000000001));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.ceil(12.123321 ));
        System.out.println("----------------------");


        // 4. public static long round (double a)：四舍五入
        System.out.println("4. 四舍五入");
        System.out.println(Math.round(4.0000000001));
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(4.4000000001));
        System.out.println(Math.round(4.5000000001));
        System.out.println("----------------------");

        // 5. public static int max(int a, int b)：取较大值
        System.out.println("5. 最大值最小值");
        System.out.println(Math.max(10,290));
        System.out.println(Math.min(10,290));
        System.out.println("----------------------");
        //    public static int min(int a, int b)：取较小值


        // 6. public static double pow (double a, double b)：
        System.out.println("6. 取次方");
        System.out.println(Math.pow(10,2));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.pow(2,2));
        System.out.println("----------------------");

        // 7. public static double random()：取随机数[0.0 ，1.0）（包前不包后)
        System.out.println(Math.random());
        System.out.println("----------------------");
    }

}
