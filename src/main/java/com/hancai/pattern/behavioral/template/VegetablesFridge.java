package com.hancai.pattern.behavioral.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class VegetablesFridge extends Fridge {

    @Override
    protected void put() {
        log.info("把蔬菜放入冰箱");
    }

}
