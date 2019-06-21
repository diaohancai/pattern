package com.hancai.pattern.structural.decorator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class DecoratorTest {

    /**
     * 装饰者模式<br/>
     * 继承：覆盖、增强父方法<br/>
     * 装饰：在父方法的基础上增强父方法<br/>
     * 装饰者模式是对继承的一种补充，更加灵活
     */
    @Test
    public void testDecorator() {
        // 原生手抓饼
        Cake cake = new HandHeldCake("手抓饼");
        log.info("{} cost ${}", cake.descript(), cake.cost());

        // 加一个鸡蛋
        CakeDecorator eggDecorator = new EggDecorator(cake);
        log.info("{} cost ${}", eggDecorator.descript(), eggDecorator.cost());

        // 再加一个鸡蛋
        CakeDecorator eggDecorator2 = new EggDecorator(eggDecorator);
        log.info("{} cost ${}", eggDecorator2.descript(), eggDecorator2.cost());

        CakeDecorator sausageCakeDecorator = new SausageCakeDecorator(eggDecorator2);
        log.info("{} cost ${}", sausageCakeDecorator.descript(), sausageCakeDecorator.cost());
    }

    @Test
    public void testDecorator2() {
        Cake cake = new SausageCakeDecorator(new EggDecorator(new HandHeldCake("手抓饼")));
        log.info("{} cost ${}", cake.descript(), cake.cost());
    }

}
