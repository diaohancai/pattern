package com.hancai.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理 —— 基于接口
 *
 * @author diaohancai
 */
@Slf4j
public class SingerJDKProxyFactory {

    /**
     * 目标对象
     */
    private Dancer targer;

    public SingerJDKProxyFactory(Dancer targer) {
        this.targer = targer;
    }

    public Dancer getSingerProxy() {
        return (Dancer) Proxy.newProxyInstance(
                targer.getClass().getClassLoader(),
                targer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("jdk dynamic proxy before");
                        method.invoke(targer, args); // 执行目标对象任务
                        log.info("jdk dynamic proxy after");
                        return null;
                    }
                }
        );
    }

}
