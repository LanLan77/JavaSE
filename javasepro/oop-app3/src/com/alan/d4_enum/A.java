package com.alan.d4_enum;

public enum A {
    // 枚举类第一步必须罗列的是枚举对象的名字
    X,Y,Z;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
