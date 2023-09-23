package com.alan.d12_extends_override;
/*
什么是方法重写？
    •当子类觉得父类中的某个方法不好用，或者无法满足自己的需求时，子类可以重写一个方法名称、参数列表一样的方法，去覆盖父类的这个方法，这就是方法重写。
    •注意：重写后，方法的访问，Java会遵循就近原则。
方法重写的其它注意事项
    •重写小技巧：使用Override注解，他可以指定java编译器，检查我们方法重写的格式是否正确，代码可读性也会更好。
    •子类重写父类方法时，访问权限必须大于或者等于父类该方法的权限 （public >protected＞缺省
    •重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。
    •私有方法、静态方法不能被重写，如果重写会报错的。
*/
public class Test {
    public static void main(String[] args) {
        // 目标：认识方法重写
        // System.out.println(student.toString()) == System.out.println(student);
        B b = new B();
        b.print1();
        b.print2(1,2 );

        System.out.println("---------------------------------");
        Student student = new Student("王小美",19);
        // System.out.println(student.toString()) == System.out.println(student);
        System.out.println(student);
    }

    // 总结： 声明不变，重新实现
   /* 1.方法重写是什么？
          •子类写了一个方法名称，形参列表与父类某个方法一样的方法去覆盖父类的该方法。
      2.重写方法有哪些注意事项？
          •建议加上：@Override注解，可以校验重号是否正确，同时可读性好。
          •子类重写父类方法时，访问权限必须大于或者等于父类被重写的方法的权限。
          •重号的方法返回值类型，必须与被重写方法的返回值类型一样，或者范围更小。
          •私有方法、静态方法不能被重写。
      3．方法重写有啥应用场景？
          •当子类觉得父类的方法不好用，或者不满足自己的需求时，就可以用方法重写。*/
}
