package com.hancai.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class Tesla extends Car {

    public Tesla(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        log.info("{} drive fast", getBrand());
    }


}
