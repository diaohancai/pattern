package com.hancai.pattern.behavioral.observe;

import org.junit.Test;

/**
 * 观察者模式<br/>
 * JDK已有成熟的观察者模式工具，Observable（被观察者）、Observer（观察者）
 *
 * @author diaohancai
 */
public class ObserveTest {

    @Test
    public void testObserve() {
        Benz benz = new Benz();
        benz.addObserver(new Diao());
        benz.addObserver(new Zhang());

        benz.discount(0.8);
    }

}
