package com.alan;

import java.util.Random;

public class Case2 {
    // 目标：生成随机的验证码
    public static void main(String[] args) {
        System.out.println(creatCode(4 ));
    }

    public static String creatCode(int n){
        // 1. 定义一个for循环用于控制产生多少位的验证码字符
        Random r = new Random();
        String code = "";

        // for 循环控制生成多少位验证码
        for(int i = 1; i <= n; i++){
             int type = r.nextInt(3); // 0,1,2
            switch (type){
                case 0:
                    //随机一个数字
                    //0-9 code = code + 8
                    code += r.nextInt(10); // (0-25)+65
                    break;
                case 1:
                    //随机一个大写字母
                    //A=65, Z=65+25
                    char ch1 = (char)(r.nextInt(26)+65);
                    //类型转换
                    code += ch1;
                    break;
                case 2:
                    //随机一个小写字母
                    //A=65, Z=65+25
                    char ch2 = (char)(r.nextInt(26)+97 );
                    //类型转换
                    code += ch2;
                    break;

            }
        }
        return code;
    }

}

/*
 * 如何生成 65-91 直接的随机数
 * 65 - 91  -->  -65  -->  (0-26)+65
 * int num = r.nextInt(27)+65
 * */



/*
 * 减加法
 * 比如 生成 1-10
 * 1-10   -->   -1   -->   (0-9)+1
 * */
