package com.alan.demo;
// 目标：模仿电影信息系统

import java.util.Scanner;

/*
*   需求：1. 展示全部电影（名称，价格）
*        2. 允许用户根据电影id查询某个电影详情
* */
public class Test {
    public static void main(String[] args) {
        // 1. 设置一个电影类
        // 2. 设置一个电影的操作类
        Movie[] movies = new Movie[4];

        movies[0] = new Movie(1, "水门桥", 39.8, 9.8, "徐科", "吴京", "12万人想看");
        movies[1] = new Movie(2, "火门桥", 32.8, 9.4, "徐科", "吴京2", "12万人想看");
        movies[2] = new Movie(3, "火门桥12", 32.8, 9.4, "徐科", "吴京3", "13万人想看");
        movies[3] = new Movie(4, "火门桥21", 32.8, 9.4, "徐科", "吴京4", "15万人想看");

        // 3. 创建一个操作类的对象
        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.printAllMovies();
        movieOperator.searchById(3);

        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1. 查询全部电影信息");
            System.out.println("2. 根据id查询");
            System.out.println("请输入您的操作命令： ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            switch (command){
                case 1:
                    movieOperator.printAllMovies();
                    break;
                case 2:
                    // 根据id查询详细信息
                    System.out.println("请您输入查询的电影id： ");
                    int id = scanner.nextInt();
                    movieOperator.searchById(id);
                    break;
                default:
                    System.out.println("您的输入有误 ");
            }
        }

    }
}

// https://www.bilibili.com/video/BV1Cv411372m/?p=74&vd_source=be66e2e596d7cad20f6838213c9a00d2
