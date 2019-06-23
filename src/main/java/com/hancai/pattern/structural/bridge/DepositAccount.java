package com.hancai.pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class DepositAccount implements Account {

    @Override
    public void openAccount() {
        log.info("开户活期账号");
    }

    @Override
    public String accountType() {
        return "活期账号";
    }

}
