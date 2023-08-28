package com.alan.arraylist;

import java.util.ArrayList;

//目的： 掌握如何创建ArrayList的对象，熟悉ArrayList的常用方法

/*
* 1. 集合是什么，有什么特点:
*    * 一种容器，用来储存数据
*    * 集合的大小可变
*
* 2. ArrayList 是什么？ 怎么使用？
*    * 是集合中最常用的一种，ArrayList是泛型类，可以约束存储的数据类型。
*    * 创建对象，调用无参数构造器初始化对象：public ArrayList0;
*    * 调用相应的增删改查数据的方法
* */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个ArrayList的集合对象
        // ArrayList arrayList = new ArrayList();
        // <String>
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("王小美");
        arrayList.add("开心");
        arrayList.add("王小美");
        arrayList.add("Java");
        System.out.println(arrayList);
        System.out.println("------------------------------------------");


        // 2. 往集合某个索引位置添加一个数据
        arrayList.add(1, "MySQL");
        System.out.println(arrayList);
        System.out.println("------------------------------------------");


        // 3. 根据索引获取集合中某个索引位置的值
        String rs = arrayList.get(2);
        System.out.println(rs);
        System.out.println("------------------------------------------");


        // 4. 获取集合大小
        System.out.println(arrayList.size());
        System.out.println("------------------------------------------");


        // 5. 根据索引删除某个元素值，返回这个元素值
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);
        System.out.println("------------------------------------------");


        // 6. 直接删除某个元素值，删除成功返回true
        //    如果有相同数据，默认删除一个出现的数据
        System.out.println(arrayList.remove("Java "));
        System.out.println(arrayList);
        System.out.println("------------------------------------------");


        // 7. 修改某个索引的数据，返回原来的值
        System.out.println(arrayList.set(0, "叶良辰"));
        System.out.println(arrayList);

    }
}
