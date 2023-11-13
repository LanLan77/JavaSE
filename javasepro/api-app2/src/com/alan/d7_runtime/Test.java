package com.alan.d7_runtime;
// 目标：了解Runtime常见的几个方法
public class Test {
    public static void main(String[] args) {
        //1. public static  Runtime getRuntime（）返回与当前Java应用程序关联的运行时对象。
        Runtime r =  Runtime.getRuntime();
        //2. public void exit(int status）終止当前运行的虛拟机，该参数用作状态代码；按照惯例，非零状态代码表示异常終止。
        // r.exit(0)
        //3. public int availableProcessors ()
        System.out.println(r.availableProcessors());
        //4. public long totalMemory(）返回Java虚拟机中的内存总量。
        System.out.println(r.totalMemory()/1024/1024+"MB ");
        //5. public long freeMemory(） 返回Java虛拟机中的可用内存量
        System.out.println(r.freeMemory()/1024/1024+"MB ");
        // 6. public process exec (String command） 启动某个程序，并返回代表该程序的对象。
        //r.exec("path = ")

    }
}
