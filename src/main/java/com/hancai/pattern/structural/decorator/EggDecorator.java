package com.hancai.pattern.structural.decorator;

/**
 * @author diaohancai
 */
public class EggDecorator extends CakeDecorator {

    public EggDecorator(Cake cake) {
        super(cake);
    }

    @Override
    String descript() {
        return cake.descript() + "，加一个鸡蛋";
    }

    @Override
    double cost() {
        return cake.cost() + 2;
    }


}
