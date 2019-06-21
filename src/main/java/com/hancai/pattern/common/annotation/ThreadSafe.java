package com.hancai.pattern.common.annotation;

import java.lang.annotation.*;

/**
 * 线程安全
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface ThreadSafe {

}
