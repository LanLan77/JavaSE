package com.alan.d6_generics;

import java.util.ArrayList;

// 目标：认识泛型

/*
*   泛型
     •定义类、接口、方法时，同时声明了一个或者多个类型变量 （如：<E>），称为泛型类、泛型接口，泛型方法、它们统称为泛型。
    public class ArrayList<E>{
        }
     •作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力！这样可以避免强制类型转换，及其可能出现的异常。
     •泛型的本质：把具体的数据类型作为参数传给类型变量。
*
* */
public class Test {
    public static void main(String[] args) {
        //在没有使用泛型之前，我们可以在ArrayList加入所有类型的数据
        ArrayList arrayList= new ArrayList();
        arrayList.add("Java2");
        arrayList.add(2);
        arrayList.add('2');
        arrayList.add(new Cat());

        for (int i = 0; i < arrayList.size(); i++) {
            //不能接收是因为包含多种数据类型
            System.out.println(arrayList.get(i));
        }

        System.out.println("-------------------------------------- ");
        // 泛型：规定数据类型
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("Java1");
        arrayList.add("Java3 ");
        // arrayList1.add(new Cat());

        for (int i = 0; i < arrayList1.size(); i++) {
            String str = arrayList1.get(i);
            System.out.println(str);
        }
    }
}

class Cat{}
