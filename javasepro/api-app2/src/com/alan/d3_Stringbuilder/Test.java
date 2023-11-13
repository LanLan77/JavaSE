package com.alan.d3_Stringbuilder;
// 目标：搞清楚Stringbuilder的用法和作用
public class Test  {
    /*
    * StringBuilder的用法

        StringBuilder代表可变宇符串对象，相当于是一个容器，它里面装的宇符串是可以改变的，就是用来操作宇符串的。
        好处：StringBuilder比String更适合做宇符串的修改操作，效率会更高，代码也会更简洁。构造器

        public StringBuilder ()                 创建一个空白的可变的宇符串对象，不包含任何内容

        public StringBuilder (String str)       创建一个指定字符串内容的可变字符串对象

        public stringBuilder append(任意类型） 	添加数据并返回stringBuilder对象本身
        public StringBuilder reverse()			将对象的内容反转
        public int length()						返回对象内容长度
        public String toString()			    通过tostring(）就可以实现把StringBuilder转换为String

* */

     public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder("王小美 ");

        // 1. 拼接内容
        stringBuilder2.append("123");
        stringBuilder2.append(true);
        stringBuilder2.append(3133);
        System.out.println(stringBuilder2);
        System.out.println("-----------------------------------------");

        // 支持链式编程
        stringBuilder2.append(666).append("王小美").append("甘雨").append(true).append("222");
        System.out.println(stringBuilder2);
        System.out.println("-----------------------------------------");

        // 2. 翻转
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
        System.out.println("-----------------------------------------");

        // 3. 返回字符串长度
         System.out.println("长度为 "+stringBuilder2.length());
         System.out.println("-----------------------------------------");

         // 4. 把StringBuilder对象转化成字符串
         String str = stringBuilder2.toString();
         System.out.println(str);
    }
}
