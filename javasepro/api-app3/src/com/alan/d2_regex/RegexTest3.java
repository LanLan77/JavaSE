package com.alan.d2_regex;

import java.util.Scanner;

// 目标：校验用户输入的电话，邮箱，时间是否合法
public class RegexTest3 {
    public static void main(String[] args) {

    }

    public static void checkPhone(){
        System.out.println("请您输入您的电话号码(座机或手机)：");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();

        if(phone.matches("正则表达式")){
            

        }
    }
}
