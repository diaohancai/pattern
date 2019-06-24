package com.hancai.pattern.behavioral.mediator;

import org.junit.Test;

/**
 * 中介者模式
 *
 * @author diaohancai
 */
public class MediatorTest {

    @Test
    public void testMediator() {
        Wechat wechat = new Wechat(); // 中介者

        Colleague diao = new Colleague("刁汉财"); // 通信 A
        Colleague zhang = new Colleague("张桥"); // 通信 B

        diao.joinWechat(wechat);
        zhang.joinWechat(wechat);

        diao.send("张桥", "宝贝，吃饭饭~~");
    }

}
