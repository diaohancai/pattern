package com.hancai.pattern.structural.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author diaohancai
 */
@Slf4j
@Component
public class Disk {

    public void startup() {
        log.info("Disk startup...");
    }

    public void shutdown() {
        log.info("Disk shutdown...");
    }

}
