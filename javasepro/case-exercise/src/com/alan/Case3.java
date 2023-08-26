package com.alan;

import java.util.Scanner;

/*
* 目标： 评委打分案例
* 要求： 1. 打分满分100分
*       2. 去掉一个最高分，去掉一个最低分，算出平均分
* */
public class Case3 {
    public static void main(String[] args) {
        System.out.println(getAverageScore(10));
    }

    public static double getAverageScore(int number){
        // 1. 定义一个动态初始化的数组，负责后期存入评委的打分
        Scanner s = new Scanner(System.in);
        int[] scores = new int[number];

        // 2. 遍历数组
        for (int i=0; i < number;i++){
            System.out.println("请您录入第"+(i+1)+"个评委的分数");
            scores[i] = s.nextInt();
        }

        // 3. 计算数据
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for(int i =0; i< scores.length; i++){
            int score = scores[i];

            sum += score;

            if (score > max){
                max = score;
            }

            if (score < min){
                min  = score;
            }

        }

        // 4. 计算最最终成绩返回
        double result = (sum - max -min)/(number-2);
        return result;

    }
}
