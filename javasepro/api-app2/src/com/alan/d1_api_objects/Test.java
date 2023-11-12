package com.alan.d1_api_objects;

import java.util.Objects;

// 目标：掌握Object类常用的方法


/*
     Objects是一个工具类，提供了很多操作对象的静态方法给我们使用。
         objects类的常见方法
            public static boolean equals (object a, Object b）          先做非空判断，再比较两个对象
            public static boolean isNul1 (Object obj)                   判断对象是否为nu11，为nul1返回true，反之
            public static boolean nonNull(Object obj)                   判断对象是否不为u11，不为nu11则返回true，反之
* */
public class Test  {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "abcdefg";

        // System.out.println(s1.equals(s2)); // 如果是null，出现空指针问题无法比较
        System.out.println(Objects.equals(s1,s2)); // 更安全，更好

        System.out.println(Objects.isNull(s1)); // true
        System.out.println(s1 ==null);
        System.out.println(Objects.isNull(s2)); // false
        System.out.println(s2 ==null);
    }
}
