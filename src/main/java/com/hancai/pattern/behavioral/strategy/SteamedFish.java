package com.hancai.pattern.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author diaohancai
 */
@Slf4j
@Component
public class SteamedFish implements Cook {

    @Override
    public void cook() {
        log.info("清蒸鱼");
    }

}
