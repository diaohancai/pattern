package com.hancai.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class ProxyTest {

    private final String name = "迪丽热巴";

    /**
     * 静态代理 —— 基于继承
     */
    @Test
    public void testStaticProxy() {
        Singer singer = new SingerStaticProxy(name);
        singer.sing();
    }

    /**
     * JDK动态代理 —— 基于接口
     */
    @Test
    public void testJDKProxyFactory() {
        Dancer dancer = new SingerJDKProxyFactory(new DefaultDancer(name)).getSingerProxy();
        dancer.dance();
    }

    /**
     * CGlib动态代理 —— 基于继承
     */
    @Test
    public void testCGlibProxyFactory() {
        Singer singer = new SingerCGlibProxyFactory(new Singer(name)).getSingerProxy();
        singer.sing();
    }

}
