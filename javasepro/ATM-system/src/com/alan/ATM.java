package com.alan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// https://www.bilibili.com/video/BV1Cv411372m?p=86&vd_source=be66e2e596d7cad20f6838213c9a00d2
public class ATM {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account loginAcc; // 记录登录后的账户
    
    public void start(){
        while(true){
            System.out.println("=========欢迎来到银行管理系统=========");
            System.out.println("1. 用户登录");
            System.out.println("2. 用户开户");
            System.out.println("请选择: ");

            int command = scanner.nextInt();
            switch (command){
                case 1:
                    login();
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

    private void login(){
        while (true) {
            System.out.println("=======系统登录======");
            // 1. 判断系统中是否存在账户，不存在直接结束登录操作
            if (accounts.size()==0){
                System.out.println("当前系统中无任何账户，请先开户");
                return; // 退出登录系统
            }

            // 2. 存在账户进行登录操作
            System.out.println("输入您的账户号码：");
            String cardId = scanner.next();
            Account account = getAccountByCardId(cardId);
            // 3. 判断卡号是否存在
            if(account == null){
                System.out.println("您输入的卡号不存在，请确认");
            }else{
                while (true) {
                    // 4. 卡号存在让用户输入密码
                    System.out.println("请您输入密码");
                    String passWord = scanner.next();
                    // 判断密码是否正确
                    if(account.getPassWord().equals(passWord)){
                        loginAcc = account;
                        System.out.println("恭喜您"+account.getUserName()+"成功登录了系统，您的卡号是："+account.getCardId() );
                        // 密码正确，登录成功
                        showUserCommand();
                        return;
                    }else{
                        System.out.println("密码不正确，请重新输入");
                    }
                }

            }
        }


    }

    // 账户和密码输入成功之后展示操作页面
    private void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName()+  "您可以选择如下功能进行账户处理===== ");
            System.out.println("1. 查询");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销当前账户");

            int command = scanner.nextInt();

            switch (command){
                case 1:
                    // 查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    updatePassword();
                    break;
                case 6:
                    // 退出
                    System.out.println(loginAcc.getUserName()+"您退出系统成功 ");
                    return; // 结束当前方法
                case 7  :
                    if(deleteAccount()){
                        // 销户成功了
                        return;
                    }

                    break;
                default:
                    System.out.println("输入的指令有误，请重试 ");
            }
        }
    }

    private void updatePassword() {
        System.out.println("=====进行账户修改密码的操作=====");
        System.out.println("请您输入当前账户的密码");
        String password = scanner.next();
        if(password.equals(loginAcc.getPassWord())){
            System.out.println("请您输入修改的密码");
            String newPassword = scanner.next();
            loginAcc.setPassWord(newPassword);
        }else {
            System.out.println("对不起，您的原始密码不对，请重试");
        }
    }

    private boolean  deleteAccount() {
        System.out.println("====进行销户操作====");
        System.out.println("请问您确定销户吗？ y/n");
        String command = scanner.next();
        switch (command){
            case "y":
                if(loginAcc.getMoney()==0){
                    accounts.remove(loginAcc);
                    System.out.println("您好，您已经成功销户");
                    return true;
                }else {
                    System.out.println("对不起您的账户还有钱");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留");
                return false;
        }
    }

    private void transferMoney() {
        System.out.println("===用户转账===");
        // 1. 判断是否有其他账户
        if(accounts.size()<2){
            System.out.println("当前ATM只有一个账户，无法转账");
            return;
        }

        // 2. 判断自己是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("你自己都没钱了，别转了");
            return;
        }

        // 3.  开始转账
        while (true) {
            System.out.println("请您输入对方的卡号: ");
            String cardId = scanner.next();
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("您输入的卡号不正确，请重试");
            } else{
                // 对方的账户存在，验证姓氏
                String name =  "*"+  acc.getUserName().substring(1);
                System.out.println("请您输入【" + name+"】的 姓氏");
                String preName = scanner.next();
                // 判断姓氏是否正确
                if(acc.getUserName().startsWith(preName)){
                    //认证通过，开始转账
                    System.out.println("请您输入转账给对方的金额");
                    double money = scanner.nextDouble();
                    // 判断是否超过余额
                    if(money>loginAcc.getMoney()){
                        System.out.println("对不起您的余额不足，无法给对方转账，最多可转账"+loginAcc.getMoney());
                    }else{
                          loginAcc.setMoney(loginAcc.getMoney()-money);
                          acc.setMoney(acc.getMoney()+money);
                          return;
                    }
                }else{
                    System.out.println("对不起，您认证的姓氏有问题 ");
                }

            }
        }


    }

    private void withdrawMoney() {
        System.out.println("======取钱操作======");
        System.out.println("请输入您的取款金额");
        double money = scanner.nextDouble();

        // 更新账户余额
        if(loginAcc.getMoney()>=money){
            if (money > loginAcc.getLimit()){
                System.out.println("超过取款上限，您的取款上限为"+loginAcc.getLimit());
            }else{
                loginAcc.setMoney(loginAcc.getMoney()-money);
                System.out.println("恭喜，您取款"+money+"元，账户余额为"+loginAcc.getMoney());
            }
        }else{
            System.out.println("您的余额不足，剩余余额为"+loginAcc.getMoney() );
        }



    }

    // 存钱
    private void depositMoney() {
        System.out.println("======存钱操作======");
        System.out.println("请输入您的存款金额");
        double money = scanner.nextDouble();

        // 更新账户余额
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("恭喜，您存款"+money+"元，账户余额为"+loginAcc.getMoney());
    }


    private void showLoginAccount(){
        System.out.println("==========当前账户信息如下========");
        System.out.println("卡号： "+ loginAcc.getCardId());
        System.out.println("用户名： "+loginAcc.getUserName());
        System.out.println("性别： "+loginAcc.getSex());
        System.out.println("余额： "+loginAcc.getMoney());
        System.out.println("每次取现额度： "+loginAcc.getLimit());

    }
    // 根据卡号账户对象返回
    private Account getAccountByCardId(String cardId){
        // 遍历所有账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            // 判断卡号是否相等
            if(cardId.equals(account.getCardId())){
                return account;
            }
        }

        return null;//查无此账户
        
    }

    
 }
