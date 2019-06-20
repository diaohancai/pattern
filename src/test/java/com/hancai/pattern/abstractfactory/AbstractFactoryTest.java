package com.hancai.pattern.abstractfactory;

import org.junit.Test;

/**
 * @author diaohancai
 */
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory () {
        AirConditioner greeAirConditioner = new GreeAppliancesFactory().makeAirConditioner();
        AirConditioner mideaAirConditioner = new MideaAppliancesFactory().makeAirConditioner();

        WashingMachine greeWashingmachine = new GreeAppliancesFactory().makeWashingMachine();
        WashingMachine mideaWashingMachine = new MideaAppliancesFactory().makeWashingMachine();

        greeAirConditioner.refrigeration();
        mideaAirConditioner.refrigeration();

        greeWashingmachine.washing();
        mideaWashingMachine.washing();
    }

}
