package com.alan.string;

import java.util.Random;

public class StringCase2 {
    // 目的： 随机产生验证码，可能是大写，小写，数字
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6 ));
    }

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
