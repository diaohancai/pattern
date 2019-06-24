package com.hancai.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class Colleague {

    @Getter
    private String name;

    private Wechat wechat;

    public Colleague(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     *
     * @param receiverName
     * @param content
     */
    public void send(String receiverName, String content) {
        if(wechat == null) {
            throw new RuntimeException("没有订阅中介者");
        }

        wechat.repost(name, receiverName, content);
    }

    /**
     * 接受消息
     *
     * @param senderName
     * @param content
     */
    public void receive(String senderName, String content) {
        log.info("{} 收到来自 {} 的消息：{}", name, senderName, content);
    }

    public void joinWechat(Wechat wechat) {
        this.wechat = wechat;

        wechat.addColleague(this);
    }

    public void departWechat(Colleague colleague) {
        wechat = null;

        wechat.removeColleague(this);
    }

}
