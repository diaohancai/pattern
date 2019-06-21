package com.hancai.pattern.structural.decorator;

import lombok.Getter;

/**
 * @author diaohancai
 */
public abstract class Cake {

    @Getter
    private String name;

    public Cake() {

    }

    public Cake(String name) {
        this.name = name;
    }

    abstract String descript();

    abstract double cost();

}
