package com.alan.d4_StringJoiner;

import java.util.StringJoiner;

// 目标：掌握StringJoiner的使用

/*
*   StringJoiner
        •JDK8开始才有的，跟StringBuilder一样，也是用来操作字符串的，也可以看成是一个容器，创建之后里面的内容是可变的。
        •好处：不仅能提高字符串的操作效率，并且在有些场景下使用它操作字符串，代码会更简洁

        public stringJoiner（间隔符号）                           创建一个stringJoiner对象，指定拼接时的间隔符号
        public stringJoiner（问隔符号，开始符号，结束符号）          创建-个StringJoiner对象，指定拼接时的间隔符号、开始符号、结束符号

        public StringJoiner add（添加的内容）
        public int length ()
        public String toString()

* */
public class Test {
    public static void main(String[] args) {
        StringJoiner stringJoiner1 = new StringJoiner(","); // 间隔符
        StringJoiner stringJoiner = new StringJoiner(",","{","]");
        stringJoiner.add("111");
        stringJoiner.add("王小美");
        stringJoiner.add("哈哈哈");
        stringJoiner.add("狗狗");

        System.out.println(stringJoiner );
        System.out.println("----------------------------------------");

        System.out.println(getArrayData(new int[]{121,13,444,12,666}));
    }

    public static String getArrayData(int[] arr) {
        //1、判断arr是否为null
        if(arr == null){
            return null;
        }
        // 2. arrAx@#(E arr = [11, 22, 33]
        StringJoiner s = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i] + "");
        }
        return s.toString();
    }
}
