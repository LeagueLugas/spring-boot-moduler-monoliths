package com.example.auth;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AuthModuleConfiguration.class)
public @interface EnableAuthModule {
}
