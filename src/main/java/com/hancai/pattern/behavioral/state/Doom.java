package com.hancai.pattern.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 末日状态
 *
 * @author diaohancai
 */
@Slf4j
public class Doom implements State {

    @Override
    public void attack() {
        log.info("普通攻击");
    }

    @Override
    public void magic() {
        log.info("末日状态！无法使用魔法攻击");
    }

    @Override
    public void useItems() {
        log.info("末日状态！无法使用物品");
    }

    @Override
    public void recovering() {
        log.info("恢复");
    }

}
