package com.hancai.pattern.factory;

/**
 * @author diaohancai
 */
public class BenzFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Benz("Benz");
    }

}
