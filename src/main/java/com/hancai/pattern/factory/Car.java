package com.hancai.pattern.factory;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
public abstract class Car {

    @Getter
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public abstract void drive();

}
