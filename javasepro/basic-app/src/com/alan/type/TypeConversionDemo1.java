package com.alan.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        byte a = 12;
        int b = a;
        //发生自动类型转换
        System.out.println(a);
        System.out.println(b);
        //范围类型小的变量可以直接赋值给类型范围大的变量

        // byte --> short --> int --> long --> float --> double
        // 表达式的结果是由最高类型决定
        // byte, short, char 是直接转换成int参与计算

        byte b1 = 110;
        byte b2 = 80;
        int b3 = b1 + b2;
        System.out.println(b3 );
    }
}
