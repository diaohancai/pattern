package com.hancai.pattern.creational.singleton;

import com.hancai.pattern.common.annotation.ThreadSafe;

@ThreadSafe
public enum EnumSingleton implements IWork {

    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("Enum singleton");
        }
    };

    /**
     * enum 默认实现 private 无参构造函数
     */
    /*private EnumSingleton() {

    }*/

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
