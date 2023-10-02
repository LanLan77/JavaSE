package com.alan.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

// 目标：学会增强for循环

/*
*   格式
*       for(元素数据类型 变量名：数组或集合){
*
*           }
*
* */

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java1");
        collection.add("王小美");
        collection.add("甘雨");
        collection.add("java2");
        collection.add("hello");
        System.out.println(collection);
        System.out.println("------------------------------------ ");


        // 使用增强for循环遍历集合或者数组
        System.out.println("使用增强for循环遍历集合");
        for(String ele: collection){
            System.out.println(ele);
        }

        System.out.println("------------------------------------ ");
        System.out.println("使用增强for循环遍历数组");
        String[] names = new String[]{"迪丽热巴","王小美","刻晴"};

        for(String s: names){
            System.out.println(s);
        }

    }
}
