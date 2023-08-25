package com.alan;

public class Case1 {
    public static void main(String[] args) {
        // 目标：完成买飞机票案例

        /*
         * 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
         * 优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折;
         * 11月到来年4月为淡季，头等舱7折，经济舱6.5折
         * 请开发程序计算出用户当前机票的优惠价。
         * */
        double price = calculate(1000, 11,"经济舱");
        System.out.println("优惠价是"+ price);
    }

    public static double calculate(double price, int month, String type) {
        // 1. 判断当前月份是淡季还是旺季
        if (month >= 5 && month <= 10) {
            //这是旺季
            // 2. 判断仓位类型
            switch (type) {
                case "头等舱":
                    price = price * 0.9;
                    break;
                case "经济舱":
                    price = price * 0.85;
                    break;
            }
        } else {
            //这是淡季
            switch (type) {
                case "头等舱":
                    price = price * 0.7;
                    break;
                case "经济舱":
                    price = price * 0.65;
                    break;
            }
        }
        return price;
    }
}
