package com.hancai.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class DefaultDancer implements Dancer {

    private String name;

    public DefaultDancer(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        log.info("{} dancing", name);
    }

}
