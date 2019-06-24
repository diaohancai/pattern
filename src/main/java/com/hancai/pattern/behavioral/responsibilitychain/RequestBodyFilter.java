package com.hancai.pattern.behavioral.responsibilitychain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class RequestBodyFilter implements MyFilter {

    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        log.info("{} set body", this);
        request.setBody("userid=666");

        chain.doFilter(request, response, chain);

        log.info("{} after doFilter", this);
    }

}
