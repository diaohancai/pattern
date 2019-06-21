package com.hancai.pattern.structural.decorator;

import lombok.Getter;

/**
 * 装饰者模式<br/>
 * 继承：覆盖、增强父方法<br/>
 * 装饰：在父方法的基础上增强父方法<br/>
 * 装饰者模式是对继承的一种补充，更加灵活
 *
 * @author diaohancai
 */
public abstract class CakeDecorator extends Cake {

    protected Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

}
