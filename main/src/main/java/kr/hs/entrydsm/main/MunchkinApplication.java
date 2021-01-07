package kr.hs.entrydsm.main;

import kr.hs.entrydsm.main.confniguration.ContextConfiguration;
import kr.hs.entrydsm.main.confniguration.MunchkinApplicationBuilder;
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

    public static synchronized void main(String[] args) {
        SpringApplication application = new MunchkinApplicationBuilder(MunchkinApplication.class)
                .properties(ContextConfiguration.PROPS_CONFIG_NAME)
                .build(args);
//        SpringApplication application = new SpringApplicationBuilder(MunchkinApplication.class)
//                .properties(ContextConfiguration.PROPS_CONFIG_NAME)
//                //.sources(MunchkinApplication.class).web(WebApplicationType.NONE)
//                    .child(ContextConfiguration.User.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.Admin.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.Notification.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.Application.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.Score.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.School.class).web(WebApplicationType.NONE)
//                    .sibling(ContextConfiguration.Web.class).web(WebApplicationType.SERVLET)
//                .build();

        application.run(args);
    }

}
