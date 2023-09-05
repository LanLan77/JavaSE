package com.alan.d3_util;

import java.util.Random;

/*      1.类方法有啥应用场景？
            •可以用来设计工具类。
        2．工具类是什么，有什么好处？
            •工具类中的方法都是类方法，每个类方法都是用来完成一个功能的。
            •提高了代码的复用性；调用方便，提高了开发效率。
        3．为什么工具类要用类方法，而不是用实例方法？
            •实例方法需要创建对象来调用，会浪费内存。
        4. 工具类定义时有什么要求？
            •工具类不需要创建对象，建议將工具类的构造器私有化。
*/

public class MyUtil {

    //把类设计为私有，不希望大家创建实例类，仅作为工具类

    private MyUtil(){

    }

    // 使用类方法生成工具类
    public static String createCode(int n){
            String code = "";
            String data = "abedefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            Random random = new Random();
            // 随机生成n个字符
            for (int i = 0; i < n; i++) {
                // 随机字符的范围索引
                int index = random.nextInt(data.length());
                // 根据索引去除全部字符中提取该字符
                code += data.charAt(index);
            }
        return code;
    }
}
