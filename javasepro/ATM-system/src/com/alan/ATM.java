package com.alan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// https://www.bilibili.com/video/BV1Cv411372m?p=86&vd_source=be66e2e596d7cad20f6838213c9a00d2
public class ATM {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Account> accounts = new ArrayList<>();
    
    public void start(){
        while(true){
            System.out.println("=========欢迎来到银行管理系统=========");
            System.out.println("1. 用户登录");
            System.out.println("2. 用户开户");
            System.out.println("请选择: ");

            int command = scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("进入用户登录功能");
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("输入指令有误请重试");
            }


        }
    }


    // 用户开户操作
    private void createAccount(){
        // 1. 创建账户对象，用于创建账户信息
        Account account = new Account();
        // 2. 需要用户输入自己的开户信息
        System.out.println("请输入您的账户名称");
        String name = scanner.next();
        account.setUserName(name);

        while (true) {
            System.out.println("请输入您的账户性别  ");
            char sex = scanner.next().charAt(0);
            if(sex =='男'|| sex =='女'){
                account.setSex(sex);
                break;
            }else {
                System.out.println("输入有误，只能是男或者女");
            }
        }


        while (true) {
            System.out.println("请输入您的账户密码");
            String password = scanner.next();
            System.out.println("请输入您的确认密码");
            String okPassword = scanner.next();
            if(okPassword.equals(password)){
                account.setPassWord(password);
                break;
            }else {
                System.out.println("您输入的密码不一致，请重新设置密码");
            }
        }

        System.out.println("请输入您的取现额度： ");
        double limit = scanner.nextDouble();
        account.setLimit(limit );

        String newCardId = createCardId();
        account.setCardId(newCardId);

        // 3. 把账户存到账户集合
        accounts.add(account);
        System.out.println("恭喜您"+ account.getUserName()+"开户成功,您的卡号是： "+ account.getCardId() );
    }

    // 4. 返回一个8位数的卡号返回
    private String createCardId(){
        while (true) {
            Random random = new Random();
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                int data = random.nextInt(10);
                cardId += data;
            }

            Account account = getAccountByCardId(cardId);
            if (account==null){
                return cardId;
            }
        }

    }


    // 根据卡号账户对象返回
    private Account getAccountByCardId(String cardId){
        // 遍历所有账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account account = new Account();
            // 判断卡号是否相等
            if(account.getCardId().equals(cardId)){
                return account;
            }
        }

        return null;//查无此账户
        
    }

    
 }
