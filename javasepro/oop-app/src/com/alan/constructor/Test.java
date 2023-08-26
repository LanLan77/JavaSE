package com.alan.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("王小美",88);
        Student s2 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.score);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
