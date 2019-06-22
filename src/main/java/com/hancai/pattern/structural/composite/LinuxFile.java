package com.hancai.pattern.structural.composite;

import lombok.Data;

/**
 * Linux Text文件<br/>
 * Leaf 叶子
 *
 * @author diaohancai
 */
@Data
public class LinuxFile extends File {

    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件后缀
     */
    private String suffix;

    /**
     * 文件内容
     */
    private String content;

    public LinuxFile(String name, String suffix, int level) {
        this.name = name;
        this.suffix = suffix;
        this.level = level;
    }

    @Override
    public void list() {
        for (int j = 0; j < level; j++) {
            printTable();
        }
        System.out.println(name + "." + suffix);
    }

    @Override
    public void cat() {
        System.out.print(content);
    }

}
