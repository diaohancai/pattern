package com.hancai.pattern.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 正常状态
 *
 * @author diaohancai
 */
@Slf4j
public class Normal implements State {

    @Override
    public void attack() {
        log.info("普通攻击");
    }

    @Override
    public void magic() {
        log.info("魔法攻击");
    }

    @Override
    public void useItems() {
        log.info("使用物品");
    }

    @Override
    public void recovering() {
        log.info("恢复");
    }

}
