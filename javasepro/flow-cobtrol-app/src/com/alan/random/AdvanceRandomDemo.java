package com.alan.random;

import java.util.Random;

public class AdvanceRandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        // 生成指定区间的随机数

        /*
        * 减加法
        * 比如 生成 1-10
        * 1-10   -->   -1   -->   (0-9)+1
        * */

        // 生成1-100的随机数
        for (int i = 0; i< 20 ; i++) {
            int result = random.nextInt(99)+1;
            System.out.println(result);
        }

        /*
        * 如何生成 65-91 直接的随机数
        * 65 - 91  -->  -65  -->  (0-26)+65
        * int num = r.nextInt(27)+65
        * */
    }
}
