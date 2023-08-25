package com.alan.define;

public class DefineArray {
    public static void main(String[] args) {
        // 掌握静态初始化数组

        // 1. 标准写法
        int[] ages1 = new int[] {12,34,46};
        double[] scores1 = new double[] {22.1,43.3,4};

        // 2. 简化写法
        int[] ages2 = {12,34,46};
        double[] scores2 =  {22.1,43.3,4};

        // 3. [] 可以随意放
        int ages3[] = {12,34,46};
        double scores3[] =  {22.1,43.3,4};

    }
}
