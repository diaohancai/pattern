package com.hancai.pattern.behavioral.command;

/**
 * @author diaohancai
 */
public class Boss {

    /**
     * 给员工下达命令
     *
     * @param staff
     * @param command
     */
    public void publishCommand(Staff staff, Command command) {
        command.setStaff(staff);
        command.execute();
    }

}
