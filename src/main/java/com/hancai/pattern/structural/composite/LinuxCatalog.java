package com.hancai.pattern.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Linux 目录<br/>
 * Node 节点
 *
 * @author diaohancai
 */
@Data
public class LinuxCatalog extends File {

    /**
     * 目录名称
     */
    private String name;

    /**
     * 组合模式（Tree结构，自己拥有自己）
     */
    private List<File> files = new ArrayList<>();

    public LinuxCatalog(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addFile(File file) {
        removeFile(file);
        files.add(file);
    }

    @Override
    public void removeFile(File file) {
        if (files.contains(file)) {
            files.remove(file);
        }
    }

    @Override
    public void list() {
        for (int i = 0; i < level; ++i) {
            printTable();
        }
        System.out.println(name);

        if (files.size() > 0) {
            for (int j = 0; j < files.size(); ++j) {
                files.get(j).list(); // 递归
            }
        }
    }

}
