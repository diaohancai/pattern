package com.hancai.pattern.structural.flyweight;

import com.hancai.pattern.PatternApplicationTests;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 享元模式
 *
 * @author diaohancai
 */
@Slf4j
public class FlyWeightTest extends PatternApplicationTests {

    @Autowired
    private BalloonHolder balloonHolder;

    /**
     * 享元模式：就是缓存了啦
     * 将常用的对象缓存起来，避免对象重复的创建、销毁
     */
    @Test
    public void testFlyWeight() {
        Balloon red = balloonHolder.getBalloon("red");
        log.info(red.toString());

        Balloon yellow = balloonHolder.getBalloon("yellow");
        log.info(yellow.toString());
    }

    /**
     *  Integer 使用了享元模式，内存有个 IntegerCache，
     *  将 -128~127 的整数缓存起来，使用 Integer.valueof(); 时 将采用缓存
     */
    @Test
    public void testIntegerCache() {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        log.info("a==b : {}", (a == b));

        Integer c = Integer.valueOf(200);
        Integer d = 200;
        log.info("a==b : {}", (c == d));
    }

}
