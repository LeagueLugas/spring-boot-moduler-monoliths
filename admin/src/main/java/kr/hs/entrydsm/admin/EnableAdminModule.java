package kr.hs.entrydsm.admin;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(2)
@ComponentScan(basePackageClasses = AdminModuleConfiguration.class)
@Import(AdminModuleConfiguration.class)
public @interface EnableAdminModule {
}
