package com.alan.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    // 1. 定义一个ArrayList负责储存菜品信息
    private ArrayList<Food> foodArrayList= new ArrayList<>();
    // foodArrayList = [];


    // 2. 开发功能，上架菜品功能
    public void addFood(){
         // 3. 创建一个菜品对象，封装上架菜品信息
        Food food = new Food();

        // 4. 录入菜品信息进去
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入该菜品名称： ");
        String name = scanner.next();
        food.setName(name);

        System.out.println("请您输入该菜品价格： ");
        double price = scanner.nextDouble();
        food.setPrice(price);

        System.out.println("请您输入该菜品描述： ");
        String description = scanner.next();
        food.setDesc(description );

        // 5. 把菜品对象存入到集合中去
        foodArrayList.add(food);
    }


    // 6. 展示所有菜品
    public void showAllFoods(){
        if(foodArrayList.size()==0){
            System.out.println("什么菜品都没有");
            return;
        }
        System.out.println("-----------所有菜品信息如下-----------");
        for (int i = 0; i < foodArrayList.size(); i++) {
            Food f = foodArrayList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("------------------------------------");
        }
    }

    // 7. 负责展示操作页面
    public void start(){
        while (true) {
            System.out.println("请选择功能： ");
            System.out.println("1. 上架菜品");
            System.out.println("2. 展示菜品");
            System.out.println("3. 退出");

            Scanner scanner = new Scanner(System.in);
            String Command = scanner.next();
            switch (Command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    // break 是结束跳出switch
                    break;
                case "3":
                    System.out.println("欢迎下次使用");
                    // return 是结束整个方法
                    return;
                default:
                    System.out.println("输入指令有误，请重新输入指令");
                    // 重新执行主界面
            }
        }
    }


}
