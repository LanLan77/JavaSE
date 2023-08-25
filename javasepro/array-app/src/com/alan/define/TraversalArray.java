package com.alan.define;

public class TraversalArray {
    public static void main(String[] args) {
        int[] ages = {2,4,13,99,22,55,65,85};

        // 1. 遍历年龄
        for(int i = 0; i< ages.length; i++){
            System.out.println("第"+(i+1)+"个人的年龄是"+ages[i]);
        }

        // 2. 找出最大值
        int max = 0;
        for(int i = 0; i< ages.length; i++){
            if(ages[i]>max){
                max = ages[i];
            }
        }
        System.out.println("最大值为"+max);

        // 2. 找出最小值
        int min = 9999;
        for(int i = 0; i< ages.length; i++){
            if(ages[i] <min){
                min = ages[i];
            }
        }
        System.out.println("最小值为"+min );
    }
}
