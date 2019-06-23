package com.hancai.pattern.structural.bridge;

/**
 * @author diaohancai
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        this.account = account;
    }


    @Override
    void openAccount() {
        account.openAccount(); // 委托 Account 接口实现
    }

    @Override
    String accountType() {
        return account.accountType(); // 委托 Account 接口实现
    }
}
