package com.alan.operator;


public class TernaryOperator {
    public static void main(String[] args) {
        // 掌握三元运算符
        double score = 90.5;
        String result = score >= 60 ? "成绩及格":"成绩不及格";
        System.out.println(result);
         //需求：找出两个数的最大值
        int a = 99;
        int b = 67;
        int max = a > b ? a:b;
        System.out.println(max);



    }
}
