package com.hancai.pattern.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class AdapterTest {

    /**
     * 适配器模式，更多的是逻辑上的适配，
     * 比如将 220V 电源 适配成 110V，需要 220V 作为输入源，转成 110V，
     * 通过继承、has-a 均可实现，推荐使用 has-a 模式
     */
    @Test
    public void testAdapter() {
        Power ac220Power = new AC220Power();
        log.info("{} output {}V", ac220Power, ac220Power.output());

        // 220V 电源 适配成 110V
        Power ac110Power = new AC110Power(ac220Power);
        log.info("{} output {}V", ac110Power, ac110Power.output());
    }

}
