package com.alan.d9_interface_demo;

import java.util.ArrayList;

public class StudentOperaterImple2 implements StudentOperater{
    @Override
     public void printAllInfo(ArrayList<Student> students) {
        int countMale = 0, countFemale = 0;
        System.out.println("--------------全班全部学生信息如下-------------");
        for (int i = 0;  i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println("姓名: "+s.getName()+" 性别："+s.getSex()+" 分数 ："+s.getScore());
            if(s.getSex()=='男'){
                countMale +=1;
            } else if (s.getSex()=='女') {
                countFemale +=1;
            }
    }
        System.out.println("男生人数： "+countMale+ " 女生人数： "+ countFemale);
        System.out.println("------------------------------------------------");
}

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double maxScore = 0.0;
        double minScore = 0.0;
        double allScore = 0.0;
        for (int i = 0;  i < students.size(); i++) {
            Student s = students.get(i);
            allScore += s.getScore();
            if(s.getScore()>maxScore) maxScore = s.getScore();
            if(s.getScore()<minScore) minScore = s.getScore();
        }
        System.out.println("平均分： "+ allScore/students.size());
        System.out.println("最高分： "+ maxScore);
        System.out.println("最低分： "+ minScore );

    }
}
