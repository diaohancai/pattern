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
        /*CPU AMD Ryzen 5 2600X	1	¥1499	49家商家	立即购买
    主板	微星X470 GAMING PLUS	1	¥1399	37家商家	立即购买
    内存	Team 冥神Dark 8GB DDR4 3000（TDGED48G3000HC16A01）	1	¥309	1家商家	查询底价
    硬盘	希捷Desktop 2TB 7200转 8GB混合硬盘（ST2000DX001）	1	¥499	44家商家	查询底价
    固态硬盘	海康威视C2000 M.2（512GB）	1	¥599	暂无商家	查询底价
    显卡	蓝宝石RX 590 8G D5 超白金 OC	1	¥1699	25家商家	查询底价*/

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
