package com.alan.d10_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

// 目标：掌握Arrays类的常用方法
public class Test {
    public static void main(String[] args) {
        // 1、public static String toString(类型[] arr)：返回数组的内容
        int arr[] = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        System.out.println("-------------------------------------- ");

        //2.public static int[] copyOfRange(类型[J arr，起始索引，结束索引）：拷贝数组〈指定范周，包前不包后)
        int[] arr2 = Arrays.copyOfRange (arr,1,4);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------------------------------- ");
        //3.public static copyOf（类型[J arr, int newLength)：拷贝数组，可以指定新数组的长度。
        int[] arr3 = Arrays.copyOf(arr,20);
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------------------------- ");
        //4、public static setAlz (double [J array, IntToDoubleFunction generator)：把数组中的原数据改为新数据又存进去。
        double[] prices = {10.3,43.4,121.5,16};
        //把所有商品打八折再存入新数组
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                 return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
        System.out.println("-------------------------------------- ");
        //5、public static void sort(类型[J arr)：对数组进行排序(默认是升序排序)
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices ));
    }
}
