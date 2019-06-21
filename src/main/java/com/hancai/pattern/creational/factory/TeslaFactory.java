package com.hancai.pattern.creational.factory;

/**
 * @author diaohancai
 */
public class TeslaFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Tesla("Tesla");
    }

}
