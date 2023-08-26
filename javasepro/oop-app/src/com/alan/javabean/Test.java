package com.alan.javabean;

 public class Test {
     // 目标：掌握实体类的书写要求

     /*
     * 实体JavaBean = 实体类
     * 特点：1. 成员变量都要私有，提供get，set方法
     *      2. 必须有一个公共的无参构造器
     * 实体类有什么应用场景：数据和数据业务相分离
     * */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("王小美");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());

        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();


    }
}
