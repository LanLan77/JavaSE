package com.alan.string;

public class StringDemo2 {
    public static void main(String[] args) {
        // 目标：掌握String常用功能

        // 1. 获取字符串长度
        String s = "Alan学JAVA ";
        System.out.println(s.length());

        // 2. 提取某个字符
        char c = s.charAt(1);
        System.out.println();


        System.out.println("---------------------------");
        // 3. 字符串遍历
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }

        // 4. 转换成数组再遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }


        System.out.println("---------------------------");
        // 5. 判断字符串内容
        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println(s1 == s2);       // False
        System.out.println(s1.equals(s2));  // True


        System.out.println("---------------------------");
        // 5. 忽略大小写判断字符串内容
        String c1 = "abcd";
        String c2 = "ABCD";
        System.out.println(c1.equals(s2));
        System.out.println(c1.equalsIgnoreCase(s2));

        // 6. 截取字符串内容（包前不包后）
        String s3 = "JAVA是最好的语言之一";
        String rs = s3.substring(0,8);
        System.out.println(rs);

        // 7. 从当前位置一直截取到末尾
        String rs2 = s3.substring(4);
        System.out.println(rs2);

        // 8. 替换字符串内容
        String info = "这个垃圾电影真是个垃圾，垃圾电影";
        String rs3 = info.replace("垃圾","可爱");
        System.out.println(rs3);

        // 9. 判断字符串是否包含关键字
        String info2 = "JAVA是最好的语言之一,我爱JAVA,JAVA不爱我";
        System.out.println(info2.contains("JAVA"));
        System.out.println(info2.contains("JAVA1"));

        // 10. 判断字符串是否由。。开头
        System.out.println("判断字符串是否由。。开头");
        System.out.println(info2.startsWith("JAVA"));
        System.out.println(info2.startsWith("123"));

        // 11. 把字符串分割，用String[]数组保存
        String rs5 = "老赵，小明，王小美，大锤，叶良辰";
        String[] names = rs5.split("， ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
