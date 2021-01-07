package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.admin.EnableAdminModule;
import kr.hs.entrydsm.application.EnableApplicationModule;
import kr.hs.entrydsm.notification.EnableNotificationModule;
import kr.hs.entrydsm.school.EnableSchoolModule;
import kr.hs.entrydsm.score.EnableScoreModule;
import kr.hs.entrydsm.user.EnableUserModule;
import org.springframework.context.annotation.Import;

public class ContextConfiguration {

    public static final String PROPS_CONFIG_NAME = "spring.config.name: main, user, admin, notification, application, score, school";

    @EnableUserModule
    public static class User {
    }

    @EnableAdminModule
    @DependentModule(User.class)
    public static class Admin {
    }

    @EnableNotificationModule
    @DependentModule(Admin.class)
    public static class Notification {

    }

    @EnableApplicationModule
    public static class Application {
    }

    @EnableScoreModule
    public static class Score {
    }

    @EnableSchoolModule
    public static class School {
    }

    @Import(WebApplicationConfigure.class)
    public static class Web {
    }

}
