package com.hancai.pattern.creational.abstractfactory;

/**
 * @author diaohancai
 */
public class GreeAppliancesFactory implements AppliancesFactory {

    @Override
    public AirConditioner makeAirConditioner() {
        return new GreeAirConditioner("Gree");
    }

    @Override
    public WashingMachine makeWashingMachine() {
        return new GreeWashingMachine("Gree");
    }

}
