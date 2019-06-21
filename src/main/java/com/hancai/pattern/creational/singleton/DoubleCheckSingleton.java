package com.hancai.pattern.creational.singleton;

/**
 * 双重检测（懒汉式） 单例模式
 *
 * @author diaohancai
 */
public class DoubleCheckSingleton {

    /**
     * volatile 禁止指令重排
     */
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        /*
         * 如果 synchronized 中，new DoubleCheckSingleton(); 发生指令重排，
         * 1、分配内存
         * 3、变量指向堆内存
         * 2、初始化对象
         * 并且那个线程在 3、变量指向堆内存 的时候，线程挂起
         *
         * 另外一个线程 执行到 下面的 if(instance == null) 时，
         * instance 就不为null了，而 instance 实际上却仍未初始化完成，此时的 instance 是不可用的
         */
        if(instance == null) {
            /*
             * 本质上是缩小了 synchronized 的作用范围，提升了效率
             */
            synchronized (DoubleCheckSingleton.class) { // 类锁
                if(instance == null) {
                    /*
                     * new Object(); // 实际上有 3 个步骤
                     * 1、分配内存
                     * 2、初始化对象
                     * 3、变量指向堆内存空间
                     */
                    instance = new DoubleCheckSingleton(); // 存在指令重排风险，变量增加 volatile 禁止指令重排
                }
            }
        }
        return instance;
    }

}
