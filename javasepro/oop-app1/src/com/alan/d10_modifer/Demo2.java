package com.alan.d10_modifer;

import com.alan.d9_modifer.Fu;

public class Demo2 {

    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.privateMethod();
        //fu.method();
        // fu.protectedMethod();
        fu.publicMethod();

        Zi zi = new Zi();
        zi.publicMethod();
        // zi.protectedMethod();
    }
}
