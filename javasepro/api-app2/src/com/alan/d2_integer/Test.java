package com.alan.d2_integer;
// 目标：掌握包装类的使用

/*
*   包装类的其他常见操作
        •可以把基本类型的数据转换成字符串类型。
            public static String toString (double d)
            public String toString()
        •可以把字符串类型的数值转换成数值本身对应的数据类型。
            public static int parselnt(String s)
            public static Integer valueOf(String s)

* */


/*
*       基本类型的数据包装成对象的方案
            public Integer(int value)：已过时
            public static Integer valueOf(int i)
* */

import java.util.ArrayList;

public class Test {
    //Integer a = new Integer(12)

     public static void main(String[] args) {
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //自动装箱：可以自动把基本类型的数据转换成对象
         Integer a3 = 12;

         // 自动拆箱：可以把自动包装的类型的对象转换成基本数据类型
         Integer a4 = a3;

         // 泛型不支持基本数据类型，只支持引用数据类型
         //ArrayList<int> arrayList = new ArrayList<>();
         ArrayList<Integer> arrayList = new ArrayList<>();
         arrayList.add(12); // 自动装箱
         arrayList.add(13); // 自动装箱

         int rs = arrayList.get(1);//自动拆箱

         System.out.println("---------------------------------------------");
        // 1. 把基本数据类型转换成字符串
          Integer a = 23;
          String s1 = Integer.toString(a);
         System.out.println(s1 +1 );

         String rs2 = a.toString();
         System.out.println(rs2 +1 );

         String s3 = a + "";

         // 2.把字符串转换成对应的基本类型
         String ageStr = "29";
         int ageI =  Integer.parseInt(ageStr);
         System.out.println(ageI+1);
         int ageII = Integer.valueOf(ageStr);
         System.out.println(ageII+1);


    }

}
