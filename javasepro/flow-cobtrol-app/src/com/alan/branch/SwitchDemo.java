package com.alan.branch;

public class SwitchDemo {
    public static void main(String[] args) {
        int i = 1;
        switch (i){
            case 1:
                System.out.println("这个数是1");
                break;

            case 2:
                System.out.println("这个数是2");
                break;
        }




        String a = "hello";
        switch (a){
            case "he lo":
                System.out.println("打印的hello");
                break;

            case "no":
                System.out.println("打印的no");
                break;

            default:
                System.out.println("啥也没有");

        }

    }
}
