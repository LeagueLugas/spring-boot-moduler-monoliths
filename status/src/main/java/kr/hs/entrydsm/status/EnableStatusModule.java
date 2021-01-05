package kr.hs.entrydsm.status;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan(basePackageClasses = StatusModuleConfiguration.class)
@Import(StatusModuleConfiguration.class)
public @interface EnableStatusModule {
}
