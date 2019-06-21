package com.hancai.pattern.creational.factory;

/**
 * 工厂模式，具体产品的生成方式交由子类实现
 */
public interface CarFactory {

    /**
     * 生产汽车
     *
     * @return
     */
    Car makeCar();

}
