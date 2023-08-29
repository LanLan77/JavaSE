package com.alan.arraylist;

import java.util.ArrayList;

public class ArrayListCase1 {
    // 目标：掌握从容器中找数据并删除的技巧

    public static void main(String[] args) {
        // 1. 创建一个ArrayList对象
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Java入门");
        arrayList.add("枸杞");
        arrayList.add("人字拖");
        arrayList.add("特级枸杞");
        arrayList.add("黑枸杞");
        arrayList.add("枸杞子 ");
        System.out.println(arrayList);

        // 2. 从集合中找出包含枸杞的数据并且删除
        for (int i = arrayList.size()-1; i>= 0 ; i--) {
            // 3. 取出当前遍历到的数据
            String ele = arrayList.get(i);
            // 4. 判断这个数据是否包含枸杞
            if(ele.contains("枸杞")){
                arrayList.remove(ele);
            }

        }

        System.out.println(arrayList);

    }
}
