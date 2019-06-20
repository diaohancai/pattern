package com.hancai.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class Bmw extends Car {

    public Bmw(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        log.info("{} drive stablely", getBrand());
    }

}
