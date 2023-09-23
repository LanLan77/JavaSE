package com.alan.d12_extends_override;

public class B extends A {
   /*  •重写小技巧：使用Override注解，他可以指定java编译器，
     检查我们方法重写的格式是否正确，代码可读性也会更好。*/

    // 方法重写
    @Override
    public void print1(){
        System.out.println("666");
    }

    // 方法重写
    @Override
    public void print2(int a, int b){
        System.out.println("666666 ");
    }
    // 总结： 声明不变，重新实现
}
