package com.alan.d2_inner_class2;

// 静态内部类
public class Outer  {
    public static class Inner{
        private String name;
        public static int a;
        public Inner(String name) {
            this.name = name;
        }

        public Inner() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner.a = a;
        }

        public void test(){

        }
    }

}
