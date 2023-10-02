package com.alan.d2_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*   目标： Collection集合的遍历方式之一：使用迭代器Iterator遍历
*
*   迭代器概述
        •迭代器是用来遍历集合的专用方式(数组没有迭代器)，在java中迭代器的代表是Iterator

        Iterator<E>iterator(）   返回集合中的迭代器对象，该迭代器对象默认指向当前集合的第一个元素

        boolean hasNext ()       询问当前位置是否有元素存在，存在返回true，不存在返回false

        E next ()                获取当前位置的元素，并同时将迭代器对象指向下一个元素处。
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
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        System.out.println("--------------------------------");

        System.out.println("2.我们应该使用迭代器遍历集合");
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }

    }
}
