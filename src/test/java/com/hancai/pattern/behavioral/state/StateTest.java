package com.hancai.pattern.behavioral.state;

import org.junit.Test;

/**
 * @author diaohancai
 */
public class StateTest {

    private Sven sven = new Sven();

    /**
     * 正常状态
     */
    @Test
    public void testNormalState() {
        sven.setState(Sven.NORMAL);
        perform(sven);
    }

    /**
     * 沉默状态
     */
    @Test
    public void testSilenceState() {
        sven.setState(Sven.SILENCE);
        perform(sven);
    }

    /**
     * Doom状态
     */
    @Test
    public void testDoomState() {
        sven.setState(Sven.DOOM);
        perform(sven);
    }

    /**
     * Boom状态
     */
    @Test
    public void testBoomState() {
        sven.setState(Sven.BOOM);
        perform(sven);
    }

    private void perform(State sven) {
        sven.attack();
        sven.magic();
        sven.useItems();
        sven.recovering();
    }

}
