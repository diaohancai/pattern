package com.hancai.pattern.structural.decorator;

/**
 * @author diaohancai
 */
public class HandHeldCake extends Cake {

    public HandHeldCake(String name) {
        super(name);
    }

    @Override
    String descript() {
        return getName();
    }

    @Override
    double cost() {
        return 5;
    }


}
