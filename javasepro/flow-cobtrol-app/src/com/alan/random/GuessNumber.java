package com.alan.random;

import java.util.Random;
import java.util.Scanner;

/*
* 生成一个1-100的随机数。用户去猜大了还是小了
* */
public class GuessNumber {
    public static void main(String[] args) {
        // 1. 随机产生一个1-100的数字，作为中奖号码
        Random r = new Random();
        int luckNumber = r.nextInt(100)+1;

        // 2. 定义一个死循环让用户不断猜数据
        Scanner scanner = new Scanner(System.in);
        while(true){
            // 提示用户猜测
            System.out.println("请输入您猜测的数据： ");
            int guessNumber = scanner.nextInt();

            // 判断用户猜测的数字与幸运号码的大小情况
            if(guessNumber > luckNumber){
                System.out.println("你猜测是数字过大");
            }else if(guessNumber < luckNumber){
                System.out.println("您猜测的数字过小");
            }else{
                System.out.println("恭喜您，猜测成果，这个数位" + guessNumber);
                break; // 结束死循环
            }
        }

    }
}
