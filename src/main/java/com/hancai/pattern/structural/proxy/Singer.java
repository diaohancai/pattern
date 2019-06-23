package com.hancai.pattern.structural.proxy;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class Singer {

    @Getter
    private String name;

    public Singer(String name) {
        this.name = name;
    }

    public void sing() {
        log.info("{} singing", name);
    }

}
