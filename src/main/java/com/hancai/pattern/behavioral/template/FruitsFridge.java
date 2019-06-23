package com.hancai.pattern.behavioral.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class FruitsFridge extends Fridge {

    @Override
    protected void put() {
        log.info("把水果放入冰箱");
    }

}
