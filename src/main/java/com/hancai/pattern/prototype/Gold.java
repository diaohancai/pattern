package com.hancai.pattern.prototype;

import lombok.Getter;
import lombok.ToString;

/**
 * 原型模式<br/>
 * 核心是通过 clone 复制出一个对象，避免了通过构造生成
 *
 * @author diaohancai
 */
public class Gold implements Cloneable {

    @Getter
    private String color;

    public Gold(String color) {
        this.color = color;
    }

    /**
     * 注意深、浅克隆问题；
     * clone 方法不会触发 构造方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
