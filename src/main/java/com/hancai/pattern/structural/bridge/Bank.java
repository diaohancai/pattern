package com.hancai.pattern.structural.bridge;

/**
 * 桥接模式<br/>
 * 核心：委派；将具体实现又抽离出来，委派给其他接口实现
 *
 * @author diaohancai
 */
public abstract class Bank {

    /**
     * 具体实现又抽离出来，委派给其他接口实现
     */
    protected Account account;

    abstract void openAccount();

    abstract String accountType();

}
