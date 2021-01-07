package kr.hs.entrydsm.main;

import kr.hs.entrydsm.main.confniguration.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = "kr.hs.entrydsm.main.integrate")
public class MunchkinApplication {

    public static final String PROPS_CONFIG_NAME = "spring.config.name: main, user, admin, notification, application, score, school";

    public static void main(String[] args) {
        SpringApplication application = new SpringApplicationBuilder()
                .properties(PROPS_CONFIG_NAME)
                .sources(MunchkinApplication.class).web(WebApplicationType.NONE)
                    .child(UserConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(AdminConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(NotificationConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(ApplicationConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(ScoreConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(SchoolConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(WebConfiguration.class).web(WebApplicationType.SERVLET)
                .build();

        application.run(args);
    }

}
