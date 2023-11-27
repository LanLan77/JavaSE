package com.alan.d12_method_reference;

import com.alan.d10_arrays.Student;

public class CompareByData {
    public static int compareByAge(Student o1, Student o2){
        return o1.getAge()-o2.getAge();
    }
}
