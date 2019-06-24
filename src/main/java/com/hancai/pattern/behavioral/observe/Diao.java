package com.hancai.pattern.behavioral.observe;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * @author diaohancai
 */
@Slf4j
public class Diao implements Observer {

    private String name = "刁汉财";

    @Override
    public void update(Observable o, Object arg) {
        Benz benz = null;
        if(o instanceof  Benz) {
            benz = (Benz) o;
        }

        if(benz == null) {
            throw new RuntimeException("Observable not instanceof Benz");
        }

        log.info("{} 奔驰降价啦，当前价格：{}", name, benz.getPrice());
    }

}
