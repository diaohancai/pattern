package com.hancai.pattern.behavioral.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 *
 * @author diaohancai
 */
public class MyFilterChain implements MyFilter {

    private List<MyFilter> filters = new ArrayList<>();

    /**
     * 记录 filter 链当前下标
     */
    private int index;

    public void addFilter(MyFilter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(MyRequest request, MyResponse response, MyFilterChain chain) {
        if (index == filters.size()) {
            return;
        }

        try {
            MyFilter filter = filters.get(index);
            index++;
            filter.doFilter(request, response, chain);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            index = 0;
        }
    }

}
