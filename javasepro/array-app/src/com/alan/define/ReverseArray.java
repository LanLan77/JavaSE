package com.alan.define;

public class ReverseArray {
    // 目标：数组翻转
    public static void main(String[] args) {
        // 1. 准备一个数组
        int[] ages = new int[] {1,2,30,4,50,600,7};

        // 2. 翻转
        for(int i = 0, j = ages.length-1; i < j; i++,j--){
             int temp = ages[j];
             ages[j] = ages[i];
             ages[i] = temp;
        }

        // 3. 遍历翻转后的数组
        for(int i = 0; i< ages.length; i++){
            System.out.print(ages[i]+" ");
        }

    }
}
