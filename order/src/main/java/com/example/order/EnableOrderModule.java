package com.example.order;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(OrderModuleConfiguration.class)
public @interface EnableOrderModule {
}
