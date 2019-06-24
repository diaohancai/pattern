package com.hancai.pattern.behavioral.responsibilitychain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author diaohancai
 */
@Slf4j
public class ResponseBodyFilter implements MyFilter {

    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        log.info("{} set body", this);
        StringBuilder builder = new StringBuilder();
        builder.append("<html>")
                .append("<h1>")
                .append("Filter Chain")
                .append("</h1>")
                .append("</html>");
        response.setBody(builder.toString());

        chain.doFilter(request, response, chain);

        log.info("{} after doFilter", this);
    }

}
