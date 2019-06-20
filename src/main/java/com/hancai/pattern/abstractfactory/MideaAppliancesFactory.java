package com.hancai.pattern.abstractfactory;

/**
 * @author diaohancai
 */
public class MideaAppliancesFactory implements AppliancesFactory {

    @Override
    public AirConditioner makeAirConditioner() {
        return new MideaAirConditioner("Midea");
    }

    @Override
    public WashingMachine makeWashingMachine() {
        return new MideaWashingMachine("Midea");
    }

}
