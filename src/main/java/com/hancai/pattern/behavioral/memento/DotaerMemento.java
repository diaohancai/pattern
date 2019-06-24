package com.hancai.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 备忘录模式，记录核心数据
 *
 * @author diaohancai
 */
@Data
@AllArgsConstructor
public class DotaerMemento {

    private String name;

    private int hp;

    private int mp;

}
