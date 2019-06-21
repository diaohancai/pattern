package com.hancai.pattern.creational.factory;

/**
 * @author diaohancai
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Benz("Benz");
    }

}
