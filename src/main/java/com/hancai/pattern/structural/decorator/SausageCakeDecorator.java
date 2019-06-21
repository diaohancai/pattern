package com.hancai.pattern.structural.decorator;

/**
 * @author diaohancai
 */
public class SausageCakeDecorator extends CakeDecorator {

    public SausageCakeDecorator(Cake cake) {
        super(cake);
    }

    @Override
    String descript() {
        return cake.descript() + "，加一条香肠";
    }

    @Override
    double cost() {
        return cake.cost() + 3;
    }

}
