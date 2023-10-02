package com.alan.d1_collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest1 {
    // 目标：认识Collection体系的特点
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        ArrayList<String> arrayList = new ArrayList<>(); // 有序，可重复，有索引
        arrayList.add("ArrayList 1");
        arrayList.add("ArrayList 2");
        arrayList.add("ArrayList 3");
        arrayList.add("ArrayList 4");
        arrayList.add("ArrayList 5");
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        System.out.println("------------------------------------------");
        HashSet<String> hashSet = new HashSet<>();  // 无序，不重复，无索引 
        hashSet.add("hashSet1");
        hashSet.add("hashSet2");
        hashSet.add("hashSet1");
        hashSet.add("hashSet1");
        hashSet.add("hashSet1");
        hashSet.add("hashSet3");
        hashSet.add("hashSet4");
        hashSet.add("hashSet5");
        System.out.println(hashSet);
        System.out.println("------------------------------------------");
    }
}




