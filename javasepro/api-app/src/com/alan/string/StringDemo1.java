package com.alan.string;

public class StringDemo1 {
    // 目标：创建String 对象，封装处理字符串的两种方式

    public static void main(String[] args) {
        // 1. 直接双引号得到字符串对象，封装字符串数据
        String name = "王小美";
        System.out.println(name);

        // 2. new String 创建字符串对象，并调用构造器初始化字符串
        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("叶良辰");
        System.out.println(rs2);

        char[] chars = {'a','1','c'};
        String rs3 = new String(chars);
        System.out.println(rs3);

        byte[] bytes = {97,98,99};
        String rs4 = new String(bytes);
        System.out.println(rs4 );
    }
}
