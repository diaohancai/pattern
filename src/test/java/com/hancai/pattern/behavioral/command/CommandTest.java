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
        // 命令执行者
        Staff diao = new Staff("刁汉财");
        Staff zhang = new Staff("张桥");

        // 命令
        Command workCommand = new WorkCommand();
        Command haveARestCommand = new HaveARestCommand();

        // 命令下达者
        Boss boss = new Boss();
        boss.publishCommand(diao, workCommand);
        boss.publishCommand(zhang, haveARestCommand);
    }

}
