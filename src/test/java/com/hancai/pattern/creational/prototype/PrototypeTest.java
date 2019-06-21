package com.hancai.pattern.creational.prototype;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 原型模式
 *
 * @author diaohancai
 */
@Slf4j
public class PrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Gold gold = new Gold("golden");

        Gold clone = (Gold) gold.clone(); // clone 不会触发 构造函数，避免了构造函数

        log.info("{} - {}", gold, gold.getColor());
        log.info("{} - {}", clone, clone.getColor());
    }

}
