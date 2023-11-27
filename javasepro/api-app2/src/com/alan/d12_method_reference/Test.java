package com.alan.d12_method_reference;
import com.alan.d10_arrays.Student;
import java.util.Arrays;
import java.util.Comparator;

/*
*   静态方法的引用:
*       类名::静态方法
*
*   使用场景: 如果某个Lambda表达式只是调用一个静态方法，并且前后参数一致，就可以使用静态方法引用
* */

public class Test{
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精",23,169.3);
        students[1] = new Student("紫霞",20,149.3);
        students[2] = new Student("至尊宝",22,159.3);
        students[3] = new Student("超哥",25,199.3);

        // 对数组中的学生对象，按照身高升序排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });

        // 使用Lambda简化后的形式
        // Arrays.sort(students,((o1, o2) -> o1.getAge()-o2.getAge()));
        // Arrays.sort(students,((o1, o2) -> CompareByData.compareByAge(o1,o2)));
        Arrays.sort(students,CompareByData::compareByAge);

        System.out.println(Arrays.toString(students));
    }
}