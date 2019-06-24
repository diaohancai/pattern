package com.hancai.pattern.behavioral.responsibilitychain;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author diaohancai
 */
@Slf4j
public class FilterChainTest {

    @Test
    public void testFilterChain() {
        MyFilterChain filterChain = new MyFilterChain();

        filterChain.addFilter(new RequestHeaderFilter());
        filterChain.addFilter(new RequestBodyFilter());
        filterChain.addFilter(new ResponseHeaderFilter());
        filterChain.addFilter(new ResponseBodyFilter());

        MyRequest request = new MyRequest();
        MyResponse response = new MyResponse();

        filterChain.doFilter(request, response, filterChain);

        log.info(request.toString());
        log.info(response.toString());
    }

}
