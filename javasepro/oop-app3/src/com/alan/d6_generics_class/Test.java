package com.alan.d6_generics_class;
// 目标：掌握泛型类的定义和使用
public class Test {
    public static void main(String[] args) {
        MyArrayList<String > myArrayList = new MyArrayList();
        myArrayList.add("havard");
        // myArrayList.add(11);
        String str = myArrayList.get(1);
    }
}
