package com.alan.d10_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        //约定1：认为左边对象 大于 右边对象 请您返回正整数
        //约定2：认为左边对象 小于 右边对象 请您返回负整数
        //约定3：认为左边对象 等于 右边对象 请您一定返回。
        if(this.age<o.age){
              return -1;
        } else if (this.age>o.age) {
            return 1;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
