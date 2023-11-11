package com.alan.d4_enum;

public enum B {
    // 目标：认识抽象枚举
    X(){
        @Override
        public void go() {

        }
    }
    ,Y {
        @Override
        public void go() {

        }
    };

    public abstract void go();
}
