package com.hancai.pattern.factory;

/**
 * @author diaohancai
 */
public class TeslaFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Tesla("Tesla");
    }

}
