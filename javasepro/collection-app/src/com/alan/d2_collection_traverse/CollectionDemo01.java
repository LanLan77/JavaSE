package com.alan.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*   目标： Collection集合的遍历方式之一：使用迭代器Iterator遍历
* */
public class CollectionDemo01  {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("王小美1");
        collection.add("王小美2");
        collection.add("Java1");
        collection.add("Java2 ");
        System.out.println(collection);
        System.out.println("--------------------------------");

        // 使用迭代器遍历集合
        // 1. 从集合对象中获取迭代器对象
        System.out.println("1. 从集合对象中获取迭代器对象");
        Iterator<String> it = collection.iterator();
        // (迭代器创建出来之后实际上it处于集合对象的第一个元素的位置）
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        //System.out.println(it.next());
        System.out.println("--------------------------------");

        System.out.println("2.我们应该使用迭代器遍历集合");


    }
}
