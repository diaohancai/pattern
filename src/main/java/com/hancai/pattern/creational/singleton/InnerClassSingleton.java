package com.hancai.pattern.creational.singleton;

import com.hancai.pattern.common.annotation.ThreadSafe;

/**
 * 内部类（懒汉式） 单例模式
 *
 * @author diaohancai
 */
@ThreadSafe
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    private static class InnerClass {
        private static InnerClassSingleton instance = new InnerClassSingleton();

        /*static {
            instance = new InnerClassSingleton();
        }*/

    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

}
