package com.hancai.pattern.behavioral.memento;

import java.util.Stack;

/**
 * 备忘录管理器
 *
 * @author diaohancai
 */
public class DotaerMementoManager {

    /**
     * 备忘录 栈
     */
    private Stack<DotaerMemento> mementos = new Stack<>();

    public void savePoint(Dotaer dotaer) {
        DotaerMemento memento = new DotaerMemento(dotaer.getName(), dotaer.getHp(), dotaer.getMp());
        mementos.push(memento); // 备忘录 入栈
    }

    public Dotaer rollback() {
        if(mementos.isEmpty()) {
            throw new RuntimeException("没有历史记录，不能回退");
        }

        DotaerMemento memento = mementos.pop(); // 备忘录 出站
        return new Dotaer(memento.getName(), memento.getHp(), memento.getMp());
    }

}
