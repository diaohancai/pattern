package com.hancai.pattern.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class BuilderTest {

    /**
     * 建造者模式 builder —— 链式编程
     */
    @Test
    public void testBuilder() {
        // 链式编程
        Computer computer = new Computer.ComputerBuilder()
                .cpu("CPU AMD Ryzen 5 2600X")
                .mainboard("微星X470 GAMING PLUS")
                .memory("冥神Dark 8GB DDR4 3000")
                .hardDisk("希捷Desktop 2TB 7200转")
                .solidStateHardDisk("海康威视C2000 M.2（512GB）")
                .graphicsCard("蓝宝石RX 590 8G D5")
                .price(7129)
                .build();

        log.info(computer.toString());
    }

}
