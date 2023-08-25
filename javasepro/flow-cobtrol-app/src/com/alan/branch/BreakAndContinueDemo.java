package com.alan.branch;

public class BreakAndContinueDemo {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("我爱你");
            if(i == 3){
                break;
            }
        }

        for (int i = 0; i < 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("洗碗天数为"+i);
        }


    }
}