package com.alan.d3_Stringbuilder;
// 目标：掌握StringBuilder的好处

/*
*   对于字符串相关的操作，如频繁的拼接、修改等，建议用StringBuidler，效率更高！
    注意：如果操作字符串较少，或者不需要操作，以及定义字符串变量，还是建议用String。

    StringBuffer 与 StringBuilder
        •StringBuffer的用法与StringBuilder是一模一样的
        •但 StringBuilder是线程不安全的 StringBuffer是线程安全的
* */
public class Test2 {
    public static void main(String[] args) {
         // 需求：拼接100万次的abc

        // 先用String看看性能
        String str = "";
        /*for (int i = 0; i < 1000000; i++) {
            str += "abc";
        }
        System.out.println(str);*/

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("abc");
        }
        System.out.println(stringBuilder);
    }
}
