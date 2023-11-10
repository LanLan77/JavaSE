package com.alan.d5_abstract;

public class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println(getName()+"喵喵喵  ");
    }
}
