package com.hancai.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 具体命令执行者
 *
 * @author diaohancai
 */
@Slf4j
@AllArgsConstructor
public class Staff {

    private String name;

    public void work() {
        log.info("{} 开始做嘢...", name);
    }

    public void haveARest() {
        log.info("{} 休息一会...", name);
    }

}
