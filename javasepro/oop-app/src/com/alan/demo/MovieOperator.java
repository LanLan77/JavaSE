package com.alan.demo;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    // 1. 展示全部电影信息
    public void printAllMovies(){
        System.out.println("------------系统全部电影信息如下 ----------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号： "+ m.getId());
            System.out.println("名称： "+ m.getName() );
            System.out.println("价格： "+ m.getPrice());
            System.out.println("----------------------------------------");

        }
    }

    // 2. 根据id查询电影的详细信息
    public void searchById(int id){
        System.out.println("------------——-电影详情信息如下 ------------—");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("编号： "+ m.getId());
                System.out.println("名称： "+ m.getName() );
                System.out.println("价格： "+ m.getPrice());
                System.out.println("评分： "+ m.getScore());
                System.out.println("导演： "+ m.getDirector());
                System.out.println("演员： "+ m.getActor());
                System.out.println("信息： "+ m.getInfo());
                System.out.println("----------------------------------------");
                return; // 已经找到了电影信息，没必要继续了

            }


        }
        System.out.println("没找到该电影  ");
    }

}
