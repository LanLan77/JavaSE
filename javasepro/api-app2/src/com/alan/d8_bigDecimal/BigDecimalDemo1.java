package com.alan.d8_bigDecimal;

import java.math.BigDecimal;

// 目标：掌握BigDecimal的使用，解决小数运算失真的问题
public class BigDecimalDemo1 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);
        System.out.println("--------------------------");

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        BigDecimal c2 = a1.subtract(b1);
        BigDecimal c3 = a1.multiply(b1);
        BigDecimal c4 = a1.divide(b1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
