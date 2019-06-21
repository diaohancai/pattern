package com.hancai.pattern.singleton;

import com.hancai.pattern.common.annotation.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

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
