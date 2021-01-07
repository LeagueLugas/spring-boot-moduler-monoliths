package kr.hs.entrydsm.application;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(2)
@ComponentScan(basePackageClasses = ApplicationModuleConfiguration.class)
@Import(ApplicationModuleConfiguration.class)
public @interface EnableApplicationModule {
}
