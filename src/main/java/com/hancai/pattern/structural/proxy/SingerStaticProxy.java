package com.hancai.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 静态代理 —— 基于继承
 *
 * @author diaohancai
 */
@Slf4j
public class SingerStaticProxy extends Singer {

    public SingerStaticProxy(String name) {
        super(name);
    }

    @Override
    public void sing() {
        log.info("static proxy before");
        super.sing();
        log.info("static proxy after");
    }

}
