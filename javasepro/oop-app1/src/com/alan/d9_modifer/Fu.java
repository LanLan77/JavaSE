package com.alan.d9_modifer;

public class Fu {

    // 1. 私有：只有在本类中访问
    private void privateMethod(){
        System.out.println("==private==");
    }

    // 2. 缺省：本类，在同一个包下的类
    void method(){
        System.out.println("==缺省==");
    }

    // 3. protect: 本类，同一个包下的类，任意包下的子类
    protected void protectedMethod(){
        System.out.println("====");
    }

    // 4. public: 本类，同一个包下的类，任意一个包下的子类，任意类
    public void publicMethod(){
        System.out.println("==public==");
    }

    public void test(){
        protectedMethod();
        method();
        protectedMethod();
        publicMethod();
    }
}
