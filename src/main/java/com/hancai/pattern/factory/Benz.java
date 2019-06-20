package com.hancai.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class Benz extends Car {

    public Benz(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        log.info("{} drive safely", getBrand());
    }
}
