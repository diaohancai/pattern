package com.hancai.pattern.structural.adapter;

/**
 * 适配器模式<br/>
 * 继承、has-a 均可，优先使用 has-a
 *
 * @author diaohancai
 */
public class AC110Power implements Power {

    private Power power;

    public AC110Power(Power power) {
        this.power = power;
    }

    @Override
    public int output() {
        int input = power.output();
        int output = input / 2;
        return output;
    }

}
