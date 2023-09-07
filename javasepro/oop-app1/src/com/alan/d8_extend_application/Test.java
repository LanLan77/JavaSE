package com.alan.d8_extend_application;

public class Test {
    public static void main(String[] args) {
        // 目标：清楚继承的好处

        Teacher teacher = new Teacher();
        teacher.setName("王小美");
        teacher.setSkill("Java, Spring");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        teacher.printInfo();
    }
}
