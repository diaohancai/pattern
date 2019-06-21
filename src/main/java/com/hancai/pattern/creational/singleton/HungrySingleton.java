package com.hancai.pattern.creational.singleton;

import com.hancai.pattern.common.annotation.ThreadSafe;

/**
 * 饿汉式 单例
 *
 * @author diaohancai
 */
@ThreadSafe
public class HungrySingleton {

    /**
     * 静态代码块只会执行一次，
     * 多线程环境下，也只会被其中一个线程执行，
     * 其他线程不可见
     */
    private static HungrySingleton instance = new HungrySingleton();

    /*static {
        instance = new HungrySingleton();
    }*/

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
