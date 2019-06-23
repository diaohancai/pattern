package com.hancai.pattern.structural.bridge;

import org.junit.Test;

/**
 * @author diaohancai
 */
public class BridgeTest {

    @Test
    public void testBridge() {
        ICBCBank savingICBCBank = new ICBCBank(new SavingAccount());
        savingICBCBank.openAccount();

        ICBCBank depositICBCBank = new ICBCBank(new DepositAccount());
        depositICBCBank.openAccount();
    }

}
