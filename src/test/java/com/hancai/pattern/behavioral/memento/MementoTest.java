package com.hancai.pattern.behavioral.memento;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 备忘录模式
 *
 * @author diaohancai
 */
@Slf4j
public class MementoTest {

    @Test
    public void testMemento() {
        DotaerMementoManager mementoManager = new DotaerMementoManager();

        Dotaer dotaer = new Dotaer("影魔", 100, 100);
        mementoManager.savePoint(dotaer);
        log.info(dotaer.toString());

        dotaer.uniqueSkills();
        mementoManager.savePoint(dotaer);
        log.info(dotaer.toString());

        dotaer.uniqueSkills();
        mementoManager.savePoint(dotaer);
        log.info(dotaer.toString());

        dotaer = mementoManager.rollback();
        log.info(dotaer.toString());

        dotaer = mementoManager.rollback();
        log.info(dotaer.toString());
    }

}
