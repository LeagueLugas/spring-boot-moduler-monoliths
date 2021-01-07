package kr.hs.entrydsm.user;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(1)
@ComponentScan(basePackageClasses = UserModuleConfiguration.class)
@Import(UserModuleConfiguration.class)
public @interface EnableUserModule {
}
