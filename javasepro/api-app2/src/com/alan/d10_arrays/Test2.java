package com.alan.d10_arrays;

import java.util.Arrays;
import java.util.Comparator;

// 目标：掌握如何对数组中的对象进行排序
public class Test2 {
    public static void main(String[] args) {
        Student[] student = new Student[5 ];
        student[0] = new Student("紫霞",10,1.65);
        student[1] = new Student("孙悟空",13,1.55 );
        student[2] = new Student("牛魔王",15,1.8);
        student[3] = new Student("葫芦娃",12,1.5);
        student[4]  = new Student("卢本伟",15,1.4);

        // Arrays.sort(student);
        //方式一：让该对象的类实现Comparable(比较规则)接口，然后重写compareTo方法，自己来制定比较规则。
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
        System.out.println("----------------------------------");
        //方式二：使用下面这个sort方法，创建Comparator比较器接口的匿名内部类对象，然后自己制定比较规则。
        // public static <T> void sort(TI arr, comparator<? superT>C）对数组进行排序(支持自定义排序规则）
        // 参数1：需要排序的数组
        // 参数2：Comparator比较器对象(用来制定对象的比较规则)
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //制定比较规则了：左边对象 01 右边对象。2
                //约定1：认为左边对象 大于 右边对象 请您返回正簦数
                //约定2：认为左边对象 小于 右边对象 请您返回负整数
                //约定3：认为左边对象 等于 右边对象 请您一定返回0
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(student));

    }
}
