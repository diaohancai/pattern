package com.hancai.pattern.structural.facade;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 外观者模式 facade<br/>
 * 外观者模式，就是对逻辑细节加多一层封装，
 * 对外部屏蔽实现细节。
 *
 * @author diaohancai
 */
@Component
@Data
@Slf4j
public class ComputerFacade {

    @Autowired
    private CPU cpu;

    @Autowired
    private Memory memory;

    @Autowired
    private Disk disk;

    public void startup() {
        log.info("Computer startup...");

        cpu.startup();
        memory.startup();
        disk.startup();

        log.info("Computer startup finish!");
    }

    public void shutdown() {
        log.info("Computer shutdown...");

        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();

        log.info("Computer shutdown finish!");
    }

}
