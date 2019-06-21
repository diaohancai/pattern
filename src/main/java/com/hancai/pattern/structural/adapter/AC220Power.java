package com.hancai.pattern.structural.adapter;

/**
 * @author diaohancai
 */
public class AC220Power implements Power {

    @Override
    public int output() {
        return 220;
    }

}
