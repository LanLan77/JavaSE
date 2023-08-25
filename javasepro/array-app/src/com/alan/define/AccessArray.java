package com.alan.define;

public class AccessArray {
     // 数组的访问
    public static void main(String[] args) {
         int [] age = {3,14,53,21};

         // 1. 访问数组的全部数据
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3 ]);

        // 2. 修改数组的数据
        age[0] = 1;
        System.out.println("修改后的age[0]为"+age[0]);

        // 3. 访问数组的个数
        System.out.println("数组的长度为" + age.length);

        // 4. 获取数组的最大索引
        System.out.println("数组的最大索引为" + (age.length - 1));
    }
}
