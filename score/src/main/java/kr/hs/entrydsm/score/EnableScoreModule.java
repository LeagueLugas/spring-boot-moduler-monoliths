package kr.hs.entrydsm.score;

import kr.hs.entrydsm.common.context.beans.ModuleInitializePriority;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ModuleInitializePriority(3)
@ComponentScan(basePackageClasses = ScoreModuleConfiguration.class)
@Import(ScoreModuleConfiguration.class)
public @interface EnableScoreModule {
}
