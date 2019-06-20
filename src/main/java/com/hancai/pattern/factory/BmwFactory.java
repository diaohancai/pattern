package com.hancai.pattern.factory;

/**
 * @author diaohancai
 */
public class BmwFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Bmw("BMW");
    }

}
