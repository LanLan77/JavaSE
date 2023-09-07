package com.alan.d8_extend_application;

public class Teacher extends People{
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo(){
        System.out.println(getName()+ "拥有技能： "+ getSkill());
    }
}
