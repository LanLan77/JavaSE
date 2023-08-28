package com.alan.string;

import java.util.Scanner;

public class StringCase1 {
    // 目标：完成用户登录功能
    public static void main(String[] args) {
        // 1. 开发一个登录页面
        for (int i = 0; i <3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请您输入登录名称： ");
            String loginName = scanner.next();
            System.out.println("请您输入登录密码： ");
            String loginPassword = scanner.next();

            // 5. 调用方法
            boolean rs = login(loginName,loginPassword);
            if(rs){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败");
            }
        }


    }

    // 2. 开发一个登录方法，接受用户的登录名和密码，返回认证结果
    public static boolean login(String loginName, String passWord){
        // 3. 准备一份正确的用户和密码
        String okLoginName = "Alan";
        String okPassWord = "123456789";

        // 4. 判断是否匹配
        if(loginName.equals(okLoginName)&&passWord.equals(okPassWord)){
            return true;
        }
        return false;
    }


}
