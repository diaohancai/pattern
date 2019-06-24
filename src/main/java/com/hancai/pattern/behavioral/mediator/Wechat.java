package com.hancai.pattern.behavioral.mediator;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 中介者模式<br/>
 * 通信协议中，各个通信组件之间不相互直接通信，
 * 而是通过中介者通信，每个通信组件不需要认识其他通信组件，只需要认识中介者即可
 *
 * @author diaohancai
 */
@Slf4j
public class Wechat {

    private Map<String , Colleague> colleagues = new HashMap<>();

    /**
     * 微信中转消息
     *
     * @param senderName
     * @param receiveName
     * @param content
     */
    public void repost(String senderName, String receiveName, String content) {
        log.info("转发消息：from {} to {}, content: {}", senderName, receiveName, content);

        Colleague receiver = colleagues.get(receiveName);
        if(receiver == null) {
            throw new RuntimeException("找不到消息接受者:" + receiveName);
        }

        receiver.receive(senderName, content);
    }

    public void addColleague(Colleague colleague) {
        colleagues.put(colleague.getName(), colleague);
    }

    public void removeColleague(Colleague colleague) {
        if(colleagues.containsKey(colleague.getName())) {
            colleagues.remove(colleague.getName());
        }
    }

}
