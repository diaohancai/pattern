package com.hancai.pattern.behavioral.command;

import org.junit.Test;

/**
 * 命令模式：将命令封装对象，使命令下达者与命令执行者分离
 *
 * @author diaohancai
 */
public class CommandTest {

    @Test
    public void TestCommand() {
        Staff diao = new Staff("刁汉财");
        Staff zhang = new Staff("张桥");

        Boss boss = new Boss();
        boss.publishCommand(diao, new WorkCommand());
        boss.publishCommand(zhang, new HaveARestCommand());
    }

}
