package com.hancai.pattern.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class FactoryTest {

    @Test
    public void testFactory() {
        Car benz = new BenzFactory().makeCar();
        Car tesla = new TeslaFactory().makeCar();
        Car bmw = new BmwFactory().makeCar();

        benz.drive();
        tesla.drive();
        bmw.drive();
    }

}
