package com.hancai.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class GreeAirConditioner extends AirConditioner {

    public GreeAirConditioner(String brand) {
        super(brand);
    }

    @Override
    void refrigeration() {
        log.info("{} refrigeration 111", getBrand());
    }

}
