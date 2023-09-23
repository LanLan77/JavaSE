package com.alan.d10_modifer;

import com.alan.d9_modifer.Fu;

public class Zi extends Fu {
    public void test(){
        // privatedMethod(); 报错
        // method(); 报错
        protectedMethod();
        publicMethod();
    }
}
