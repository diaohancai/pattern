package com.hancai.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class MideaAirConditioner extends AirConditioner {

    public MideaAirConditioner(String brand) {
        super(brand);
    }

    @Override
    void refrigeration() {
        log.info("{} refrigeration 222", getBrand());
    }

}
