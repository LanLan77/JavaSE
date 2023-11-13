package com.alan.d3_Stringbuilder;
/*
* 自案例返回任意整型数组的内容

    需求:设计一个方法，用于返回任意整型数组的内容，要求返回的数组内容格式如：[11，22，33]
    分析：
        •方法是否需要接收数据？ 需要接收整型数组
        •方法是否需要返回数据？ 需要返回拼接后的结果
        •方法内部：遍历数组的数据，把遍历到的数据都拼接起来，此时使用StringBuilder来完成拼接。
* */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArrayList(new int[]{11,212,4124,421}));
    }

    public static String getArrayList(int[] arr){
        // 1. 判断arr数组是不是null
        if(arr == null){
            return null;
        }
        // 2. arr数组对象存在，arr = [11,22,33 ]
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                stringBuilder.append(arr[i]);
            }
            else {
                 stringBuilder.append(arr[i]).append(",  ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
