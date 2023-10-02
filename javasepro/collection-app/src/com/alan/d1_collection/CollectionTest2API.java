package com.alan.d1_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*

    为啥要先学Collection的常用方法？
        •collection是单列集合的祖宗，它规定的方法（功能）是全部单列集合都会继承的。
    collection的常见方法如下：
        public boolean add(E e)
            把给定的对象添加到当前集合中
        public void clear ()
            清空集合中所有的元素
        public boolean remove (E e)
            把给定的对象在当前集合中删除
        public boolean contains(object obi）
            判断当前集合中是否包含给定的对象
        public boolean isEmpty ()
            判断当前集合是否为空
        public int size()
            返回集合中元素的个数。
        public Object[] toArray ()
            把集合中的元素，存储到数组中
*/

public class CollectionTest2API {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<>(); // 多态
        // 1.public boolean add(E e）：添加元素，添加成功返回true.I
        System.out.println("-----------------------------------------------------");
        System.out.println("1.public boolean add(E e）：添加元素，添加成功返回true.");
        collection.add("王小美1");
        collection.add("王小美1");
        collection.add("王小美2");
        collection.add("王小美2 ");
        collection.add("java1");
        System.out.println(collection );
        // 2.public void clear()：清空集合的元素。
        System.out.println("-----------------------------------------------------");
        System.out.println("2.public void clear()：清空集合的元素。");
        //collection.clear();
        System.out.println(collection);
        System.out.println("-----------------------------------------------------");
        // 3.public boolean isEmpty()：判断集合是否为空 是空返回true，反之。
        System.out.println("3.public boolean isEmpty()：判断集合是否为空 是空返回true，反之。");
        System.out.println(collection.isEmpty());
        System.out.println("-----------------------------------------------------");
        // 4.public int size(): 获取集合大小
        System.out.println("4.public int size(): 获取集合大小");
        System.out.println(collection.size());
        System.out.println("-----------------------------------------------------");
        // 5.public boolean contains(object obj)：判断集合中是否包含某个元素。
        System.out.println("5.public boolean contains(object obj)：判断集合中是否包含某个元素。");
        System.out.println(collection.contains("java1"));
        System.out.println(collection.contains("Java1"));
        System.out.println(collection.contains("王小美1"));
        System.out.println(collection.contains("王小美 "));
        System.out.println("-----------------------------------------------------");
        // 6.public boolean remove(E e)：删除某个元素：如果有多个重复元素默认删除前面的第一个！
        System.out.println("6.public boolean remove(E e)：删除某个元素：如果有多个重复元素默认删除前面的第一个！");
        System.out.println(collection.remove("王小美1"));
        System.out.println(collection );
        System.out.println("-----------------------------------------------------");
        // 7.public Object[] toArray()：把集合转换成数组
        System.out.println("public Object[] toArray()：把集合转换成数组");
        Object[] arr = collection.toArray();
        System.out.println(Arrays.toString(arr));
        String[ ] arr2 = collection.toArray(new String[collection.size() ]);
        System.out.println("-----------------------------------------------------");
        System.out.println("把集合中的所有数据导入另一个集合中去 ");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        c1.add("java3");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java4");
        c2.add("java5");
        c2.add("java6");

        c1.addAll(c2); // 把C2的所有数据导入到C1中去

        System.out.println(c1);
        System.out.println(c2);

    }
}
