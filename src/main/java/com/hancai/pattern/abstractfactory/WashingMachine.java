package com.hancai.pattern.abstractfactory;

import lombok.Getter;

public abstract class WashingMachine {

    @Getter
    private String brand;

    public WashingMachine(String brand) {
        this.brand = brand;
    }

    abstract void washing();

}
