package com.hancai.pattern.behavioral.strategy;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 策略模式
 *
 * @author diaohancai
 */
@Component
public class CookFish {

    @Getter
    //@Resource(name = "braiseInSoySauceFish")
    @Resource(name = "steamedFish")
    private Cook cook;

    /**
     * 策略模式，将具体实现抽离出来，委派给策略接口实现
     */
    public void cookFish() {
        cook.cook(); // 委派
    }

}
