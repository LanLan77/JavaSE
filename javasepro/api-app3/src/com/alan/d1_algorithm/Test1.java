package com.alan.d1_algorithm;

import java.util.Arrays;

// 目标：掌握冒泡排序的编写
public class Test1 {
    public static void main(String[] args) {
        //1. 准备一个数组
        int[] arr = {5,2,3,1,4,6};
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
