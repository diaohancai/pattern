package com.hancai.pattern.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class SavingAccount implements Account {

    @Override
    public void openAccount() {
        log.info("开户定期账号");
    }

    @Override
    public String accountType() {
        return "定期账号";
    }

}
