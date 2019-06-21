package com.hancai.pattern.creational.abstractfactory;

import lombok.Getter;

/**
 * @author diaohancai
 */
public abstract class AirConditioner {

    @Getter
    private String brand;

    public AirConditioner(String brand) {
        this.brand = brand;
    }

    abstract void refrigeration();

}
