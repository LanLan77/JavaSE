package com.alan.d5_abstract;

// 因为有抽象方法，所以自动变成抽象类
public abstract class Animal {
    private String name;

    public abstract void cry();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
