//package com.alan.d1_inner_class1;
//
//public class Outer {
//    private int age = 99 ;
//    public static String a;
//
//    //成员 内部类
//    public static class Inner{
//        private String name;
//        private int age = 88 ;
//        public static String SCHOOL_NAME; // JDK16
//
//        public Inner() {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public void test(){
//            System.out.println(age);
//            System.out.println(a);
//
//            int age = 66;
//
//            System.out.println(age); //66
//            System.out.println(this.age); //88
//            System.out.println(Outer.this.age); //88
//        }
//
//        }
//
//    public void test2(){
//        System.out.println(age);
//        System.out.println(a);
//    }
//}
