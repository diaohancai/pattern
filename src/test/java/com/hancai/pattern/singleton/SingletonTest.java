package com.hancai.pattern.singleton;

import com.hancai.pattern.common.annotation.ThreadSafe;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 单例模式测试<br/>
 * 推荐 内部类 和 枚举类 写法
 *
 * @author diaohancai
 */
@Slf4j
public class SingletonTest {

    /**
     * 饿汉式 单例模式
     */
    @Test
    @ThreadSafe
    public void testHungrySingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + hungrySingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + hungrySingleton);
            }
        });

        t1.start();
        t2.start();
    }

    /**
     * 内部类（懒汉式） 单例模式，推荐写法
     */
    @Test
    @ThreadSafe
    public void testInnerClassSingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + innerClassSingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + innerClassSingleton);
            }
        });

        t1.start();
        t2.start();
    }

    /**
     * double check（懒汉式） 单例模式
     */
    @Test
    @ThreadSafe
    public void testDoubleCheckSingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + doubleCheckSingleton);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + doubleCheckSingleton);
            }
        });

        t1.start();
        t2.start();
    }

    /**
     *
     */
    @Test
    @ThreadSafe
    public void testEnumSingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                EnumSingleton enumSingleton = EnumSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + enumSingleton);
                enumSingleton.doSomething();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                EnumSingleton enumSingleton = EnumSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " - " + enumSingleton);
                enumSingleton.doSomething();
            }
        });

        t1.start();
        t2.start();
    }

}
