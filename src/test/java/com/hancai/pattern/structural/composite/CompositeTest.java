package com.hancai.pattern.structural.composite;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 组合模式（Tree 结构，自己 has-a 自己）
 *
 * @author diaohancai
 */
@Slf4j
public class CompositeTest {

    @Test
    public void testComposite() {
        File root = new LinuxCatalog("root", 0); // 根节点

        File globe = new LinuxFile("globe", "pro", 1);

        File usr = new LinuxCatalog("usr", 1); // usr
        File local = new LinuxCatalog("local", 2);
        File nginx = new LinuxFile("nginx", "conf", 2);
        File rabbitMQ = new LinuxFile("rabbitMQ", "config", 2);

        File opt = new LinuxCatalog("opt", 1); // opt
        File temp = new LinuxFile("temp", "text", 2);

        File hnisi = new LinuxCatalog("hnisi", 1); // hnisi
        File middle = new LinuxCatalog("middle", 2);
        File tomcat6 = new LinuxCatalog("tomcat6", 3);
        File tomcat6Config = new LinuxFile("tomcat6", "xml", 4);

        File tomcat7 = new LinuxCatalog("tomcat7", 3);
        File tomcat7Config= new LinuxFile("tomcat7", "xml", 4);

        File webapp = new LinuxCatalog("webapp", 2);
        File sydj = new LinuxCatalog("sydj", 3);
        File sydjPom = new LinuxFile("pom", "xml", 4);
        File sydjJavaTest = new LinuxFile("test", "java", 4);

        File lset = new LinuxCatalog("lset", 3);
        File lsetPom = new LinuxFile("pom", "xml", 4);
        File lsetJavaTest = new LinuxFile("test", "java", 4);

        root.addFile(globe);

        root.addFile(usr);
        usr.addFile(local);
        local.addFile(nginx);
        local.addFile(rabbitMQ);

        root.addFile(opt);
        opt.addFile(temp);

        root.addFile(hnisi);
        hnisi.addFile(middle);
        middle.addFile(tomcat6);
        tomcat6.addFile(tomcat6Config);
        middle.addFile(tomcat7);
        tomcat7.addFile(tomcat7Config);

        hnisi.addFile(webapp);
        webapp.addFile(sydj);
        sydj.addFile(sydjPom);
        sydj.addFile(sydjJavaTest);
        webapp.addFile(lset);
        lset.addFile(lsetPom);
        lset.addFile(lsetJavaTest);

        root.list();
    }

}
