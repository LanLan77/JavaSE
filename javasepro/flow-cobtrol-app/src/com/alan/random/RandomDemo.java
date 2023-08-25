package com.alan.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        // 1. 导包
        // 2. 创建Random对象
        Random r = new Random();
        // 3. 调用Random提供的功能: nextInt() 得到随机数
        for (int i = 0; i < 20; i++ ) {
            int data = r.nextInt(10); // 0-9的随机数
            System.out.println(data);
        }

        // Command + Option + t 快捷键
    }
}
