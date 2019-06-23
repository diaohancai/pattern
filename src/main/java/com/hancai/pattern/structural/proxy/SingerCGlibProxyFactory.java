package com.hancai.pattern.structural.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * CGlib动态代理 —— 基于继承
 *
 * @author diaohancai
 */
@Slf4j
public class SingerCGlibProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Singer target;

    public SingerCGlibProxyFactory(Singer target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("cglib dynamic proxy before");
        method.invoke(target, objects); // 执行目标对象任务
        log.info("cglib dynamic proxy after");
        return null;
    }

    public Singer getSingerProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (Singer) enhancer.create(new Class[]{String.class}, new Object[]{target.getName()}); // 带参数构造函数
    }

}
