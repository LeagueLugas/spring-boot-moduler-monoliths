package kr.hs.entrydsm.main;

import kr.hs.entrydsm.application.ApplicationModuleConfiguration;
import kr.hs.entrydsm.main.status.StatusContextConfiguration;
import kr.hs.entrydsm.main.user.UserContextConfiguration;
import kr.hs.entrydsm.main.admin.AdminContextConfiguration;
import kr.hs.entrydsm.school.SchoolModuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootConfiguration
@EnableAutoConfiguration
public class MunchkinApplication {

    private static final String PROPS_CONFIG_NAME = "spring.config.name: main, user, admin, school, application, status";

    public static void main(String[] args) {
        SpringApplication application = new SpringApplicationBuilder()
                .properties(PROPS_CONFIG_NAME)
                .sources(MunchkinApplication.class).web(WebApplicationType.NONE)
                    .child(UserContextConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(AdminContextConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(SchoolModuleConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(ApplicationModuleConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(StatusContextConfiguration.class).web(WebApplicationType.NONE)
                    .sibling(WebContextConfiguration.class).web(WebApplicationType.SERVLET)
                .build();

        application.run(args);
    }

}
