package com.alan.d9_date;

import java.util.Date;

// 目标：掌握SimpleDateFormat的使用
public class SimpleDateFormat {
    public static void main(String[] args) {
        // 1. 准备一些时间
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        // 2. 格式化时间对象，和时间毫秒值
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        String rs = sdf.format(date);
        System.out.println(rs);

        System.out.println("-----------------------------");

    }
}
