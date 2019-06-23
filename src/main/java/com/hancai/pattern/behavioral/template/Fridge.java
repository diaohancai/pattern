package com.hancai.pattern.behavioral.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 模板模式
 *
 * @author diaohancai
 */
@Slf4j
public abstract class Fridge {

    /**
     * 冰箱操作：
     * step1：打开冰箱（固定行为）
     * step2：放入东西（推迟到子类实现）
     * step3：关闭冰箱（固定行为）
     */
    public final void fridgeOperation() {
        open();
        put();
        close();
    }

    /**
     * 打开冰箱（固定行为） final
     */
    private final void open() {
        log.info("打开冰箱");
    }

    /**
     * hook 钩子函数，放入东西（推迟到子类实现）
     */
    protected void put() {
        throw new NothingException("您什么东西也没有放入冰箱");
    }

    /**
     * 关闭冰箱（固定行为） final
     */
    private final void close() {
        log.info("关闭冰箱");
    }

}
