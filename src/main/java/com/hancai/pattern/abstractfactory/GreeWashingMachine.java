package com.hancai.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class GreeWashingMachine extends WashingMachine {

    public GreeWashingMachine(String brand) {
        super(brand);
    }

    @Override
    void washing() {
        log.info("{} washing 111", getBrand());
    }

}
