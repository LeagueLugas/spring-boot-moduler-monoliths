package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(4)
@Import(WebApplicationConfigure.class)
public @interface EnableWebApplication {
}
