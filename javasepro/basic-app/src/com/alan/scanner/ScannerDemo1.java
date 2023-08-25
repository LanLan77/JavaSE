package com.alan.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入您的年龄");

        //等待用户输入一个整数，直到回车键
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("请您输入您的名字");

        //等待用户输入一个字符串，直到回车键
        String name = scanner.next();
        System.out.println(name + "欢迎您进入系统");


    }
}
