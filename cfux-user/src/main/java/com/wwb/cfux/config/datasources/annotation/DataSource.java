package com.wwb.cfux.config.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    String name() default "";
}
