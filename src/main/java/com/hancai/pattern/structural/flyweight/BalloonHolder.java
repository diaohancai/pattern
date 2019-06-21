package com.hancai.pattern.structural.flyweight;

import com.hancai.pattern.common.annotation.ThreadSafe;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式：说白了就是搞个缓存 —— 内存数据库；
 * 将常用的对象缓存起来，减少该对象的重复性创建、销毁
 *
 * Holder —— 内存数据库
 *
 * @author diaohancai
 */
@ThreadSafe
@Component
public class BalloonHolder {

    /*
     * 缓存
     */
    private ConcurrentHashMap<String, Balloon> balloonCache = new ConcurrentHashMap<>();

    public Balloon getBalloon(String color) {
        Balloon balloon = balloonCache.get(color);

        if(balloon == null) {
            balloon = new Balloon(color);
            balloonCache.put(color, balloon);
        }

        return balloon;
    }

}
