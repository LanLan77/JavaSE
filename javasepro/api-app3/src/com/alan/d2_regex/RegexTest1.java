package com.alan.d2_regex;

// 目标：使用正则表达式来检验数据格式的合法性
// 需求：检验QQ号码是否正确，要求全部是数字，长度是6-20之间，不能用0开头
public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("775172380"));
        System.out.println(checkQQ1("31ccd1333"));
        System.out.println("-------------------------------- ");
    }

    public static boolean checkQQ1 (String qq){
         return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        // 1. 判断QQ号码是否为NULL
        if(qq == null || qq.startsWith("0") || qq.length()>20 || qq.length()<6){
            return false;
        }

        //2. 判断qq号码是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 判断ch记住的字符如果不是数字，则不合法
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        // 3. 说明qq号码合法
        return true;
    }
}
