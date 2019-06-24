package com.hancai.pattern.behavioral.observe;

import lombok.Getter;

import java.util.Observable;

/**
 * 被观察者
 *
 * @author diaohancai
 */
public class Benz extends Observable {

    @Getter
    public double price = 800000;

    public void discount(double percent) {
        price = price * percent; // 关注点变更
        setChanged(); // 通知关注点变更
        notifyObservers(); // 通知观察者
    }

}
