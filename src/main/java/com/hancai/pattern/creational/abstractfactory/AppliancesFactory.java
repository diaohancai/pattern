package com.hancai.pattern.creational.abstractfactory;

/**
 * 抽象工厂模式<br/>
 * 工厂模式与抽象工厂模式区别：<br/>
 * 工厂模式一般只生产一个产品，抽象工厂模式生产多个产品
 *
 * @author diaohancai
 */
public interface AppliancesFactory {

    /**
     * 生产空调
     *
     * @return
     */
    AirConditioner makeAirConditioner();

    /**
     * 生产洗衣机
     *
     * @return
     */
    WashingMachine makeWashingMachine();

}
