package com.alan.d5_abstract;

public class Dog extends Animal{
    @Override
    public void cry() {
        System.out.println(getName()+"汪汪汪 ");
    }
}
