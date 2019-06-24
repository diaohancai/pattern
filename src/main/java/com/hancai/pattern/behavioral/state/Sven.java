package com.hancai.pattern.behavioral.state;

import lombok.Setter;

/**
 * 状态模式<br/>
 * 状态不同，行为不同
 *
 * @author diaohancai
 */
public class Sven implements State {

    /**
     * 当前状态
     */
    @Setter
    private State state;

    // 可选状态
    public static State NORMAL = new Normal();
    public static State SILENCE = new Silence();
    public static State DOOM = new Doom();
    public static State BOOM = new Boom();

    public Sven() {
        state = NORMAL;
    }

    @Override
    public void attack() {
        state.attack();
    }

    @Override
    public void magic() {
        state.magic();
    }

    @Override
    public void useItems() {
        state.useItems();
    }

    @Override
    public void recovering() {
        state.recovering();
    }

}
