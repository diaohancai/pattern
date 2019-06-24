package com.hancai.pattern.behavioral.state;

/**
 * 状态模式<br/>
 * 不同的状态，有不同的行为
 *
 * @author diaohancai
 */
public interface State {

    /**
     * 普通攻击
     */
    void attack();

    /**
     * 魔法攻击
     */
    void magic();

    /**
     * 使用物品
     */
    void useItems();

    /**
     * 恢复
     */
    void recovering();

}
