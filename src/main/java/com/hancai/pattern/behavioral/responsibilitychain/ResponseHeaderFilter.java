package com.hancai.pattern.behavioral.responsibilitychain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class ResponseHeaderFilter implements MyFilter {

    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        log.info("{} put header", this);
        response.putHeader("cache", "none");

        chain.doFilter(request, response, chain);

        log.info("{} after doFilter", this);
    }

}
