package com.hancai.pattern.creational.factory;

/**
 * @author diaohancai
 */
public class BmwFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Bmw("BMW");
    }

}
