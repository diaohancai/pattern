package com.hancai.pattern.behavioral.responsibilitychain;

public interface MyFilter {

    /**
     * 责任链模式过滤
     *
     * @param request
     * @param response
     * @param chain
     */
    void doFilter(MyRequest request, MyResponse response, MyFilterChain chain);

}
