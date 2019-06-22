package com.hancai.pattern.structural.composite;

/**
 * Linux 文件系统：一切皆文件
 *
 * @author diaohancai
 */
public abstract class File {

    protected int level;

    /**
     * 添加文件
     * @param file
     */
    public void addFile(File file) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    /**
     * 删除文件
     * @param file
     */
    public void removeFile(File file) {
        throw new UnsupportedOperationException("不支持移除操作");
    }

    /**
     * 递归列出当前目录下所有文件
     */
    public void list() {
        throw new UnsupportedOperationException("不支持列出清单操作");
    }

    /**
     * 输出文件内容
     */
    public void cat() {
        throw new UnsupportedOperationException("不支持输出文件内容操作");
    }

    /**
     * 输出制表符
     */
    protected void printTable() {
        System.out.print("  ");
    }

}
