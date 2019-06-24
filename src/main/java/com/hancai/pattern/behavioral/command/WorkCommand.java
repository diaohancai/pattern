package com.hancai.pattern.behavioral.command;

import lombok.Setter;

/**
 * @author diaohancai
 */
public class WorkCommand implements Command {

    @Setter
    private Staff staff;

    @Override
    public void execute() {
        if(staff == null) {
            throw new RuntimeException("命令没有指定员工");
        }

        staff.work();
    }

}
