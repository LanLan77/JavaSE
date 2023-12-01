package com.alan.algorithm;
// 目标: 掌握二分查找的算法
public class Test3 {
    public static void main(String[] args) {
        // 1. 准备一个数组
        int[] arr = {2,41,51,71,89, 90,120,150,180,201,204,400,500,900 };

        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 71));
        System.out.println(binarySearch(arr, 90));
    }

    public static int binarySearch(int[] arr,int data){
        // 1. 定义两个位置，一个在左边，一个在右边
        int left = 0;
        int right = arr.length-1;

        // 2. 定义一个循环控制折半
        while (left <=   right){
            // 3. 每次折半，都算出中间位置处的索引
            int middle = (right + left)/2;
            // 4. 判断当前要找的元素值，与中间处的元素值的大小情况
            if(data < arr[middle]){
                right = middle-1;
            }else if(data > arr[middle]){
                left = middle+1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
