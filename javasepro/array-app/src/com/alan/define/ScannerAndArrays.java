package com.alan.define;

import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        //讲用户输入输入保存到数组中
        int[] ages = new int[7];

        System.out.println("请输入7个年龄");

        // 用户输入
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < ages.length; i++){
            int input = s.nextInt();
            ages[i] = input;
        }

        // 遍历
        for(int i =0; i< ages.length; i++){
            System.out.println(ages[i]);
        }
    }
}
