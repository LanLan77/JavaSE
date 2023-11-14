package com.alan.d9_date;

import java.util.Date;

// 目标：掌握Date时间以及应用
public class Test {
    public static void main(String[] args) {
        // 1. 创建一个Date对象，代表当前时间信息
        Date date = new Date();
        System.out.println(date);

        // 2. 拿到时间毫秒值
        long time = date.getTime();
        System.out.println(time);

        //3、把时间毫秒值转换成日期对象：2s之后的时间是多少。
        time += 2 * 1000;
        Date date1 = new Date (time);
        System.out.println(date1);
        
        // 4. 直接把日期对象时间通过setTime方法修改
         Date d3 = new Date();
         d3.setTime(time);
        System.out.println(d3);
     }
}
