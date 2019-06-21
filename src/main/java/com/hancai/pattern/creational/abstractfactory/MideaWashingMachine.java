package com.hancai.pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class MideaWashingMachine extends WashingMachine {

    public MideaWashingMachine(String brand) {
        super(brand);
    }

    @Override
    void washing() {
        log.info("{} washing 222", getBrand());
    }

}
