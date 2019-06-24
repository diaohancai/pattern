package com.hancai.pattern.behavioral.strategy;

import com.hancai.pattern.PatternApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author diaohancai
 */
public class StrategyTest extends PatternApplicationTests {

    @Autowired
    private CookFish cookFish;

    @Test
    public void testStrategy() {
        cookFish.cookFish();
    }

}
