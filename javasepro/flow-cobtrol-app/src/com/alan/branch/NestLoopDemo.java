package com.alan.branch;

public class NestLoopDemo {

    // 外部循环循环一次，内部循环执行一轮
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<5; j++){
                System.out.println("我爱你");
            }
            System.out.println("123");
        }
    }
}
