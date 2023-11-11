package com.alan.d5_enum_case;
// 掌握枚举类的应用场景，做信息标志和分类
public class Test  {
    public static void main(String[] args) {
        check(Constant2.BOY);
    }
    public static void check(Constant2 sex){
        switch (sex){
            case BOY:
                System.out.println("展示游戏信息");
                break;
            case GRIL:

                System.out.println("展示土豪信息");
                break;
        }
    }





//    public static void check(int flag){
//        switch (flag){
//            case Constant.BOY:
//                System.out.println("展示游戏信息");
//                break;
//            case Constant.GRIL:
//
//                System.out.println("展示土豪信息");
//                break;
//        }
//    }
}
