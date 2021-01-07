package kr.hs.entrydsm.notification;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(3)
@ComponentScan(basePackageClasses = NotificationModuleConfiguration.class)
@Import(NotificationModuleConfiguration.class)
public @interface EnableNotificationModule {
}
