package com.alan.d2_collection_traverse;

// 遍历集合中的自定义对象

/*    目标：完成电影信息的展示。
        new Movie ("《肖生克的救肢》"，9.7，"罗宾斯"）
        new Movie ("《霸王别麵》"，9.6，"张国菜、张丰教")
        new Movie ("(阿甘正传》"，9.5，"汤姆。汉克斯")
*/

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        // 1. 创建一个集合容器负责存储多部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie ("《肖生克的救肢》",9.7,"罗宾斯"));
        movies.add(new Movie ("《霸王别麵》",9.6,"张国菜、张丰教"));
        movies.add(new Movie ("(阿甘正传》",9.5,"汤姆。汉克斯"));
        System.out.println(movies);
        System.out.println("---------------------------------------------------");

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println("---------------------------------------------------");
        for (Movie movie : movies) {
            System.out.println("================================= ");
            System.out.println("电影名： "+movie.getName() );
            System.out.println("评分： "+movie.getScore());
            System.out.println("演员： "+movie.getActor());

        }
    }
}
