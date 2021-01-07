package kr.hs.entrydsm.main.confniguration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WebApplicationConfigure.class)
public @interface EnableWebApplication {
}
