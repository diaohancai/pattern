package com.hancai.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
@Data
@AllArgsConstructor
@ToString
public class Dotaer {

    private String name;

    private int hp;

    private int mp;

    /**
     * 大招，耗血、耗魔
     */
    public void uniqueSkills() {
        hp = hp - 20;
        mp = mp - 30;
        log.info("{} 大招——魂之挽歌，hp-20，mp-30 ", name);
    }

}
