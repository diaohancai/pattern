package com.hancai.pattern.behavioral.responsibilitychain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author diaohancai
 */
@ToString
public class MyRequest {

    private Map<String, String> header;

    @Getter
    @Setter
    private String body;

    public MyRequest() {
        header = new HashMap<>();
        body = "";
    }

    public void putHeader(String key, String value) {
        header.put(key, value);
    }

}
