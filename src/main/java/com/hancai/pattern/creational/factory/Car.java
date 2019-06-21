package com.hancai.pattern.creational.factory;

import lombok.Getter;

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
