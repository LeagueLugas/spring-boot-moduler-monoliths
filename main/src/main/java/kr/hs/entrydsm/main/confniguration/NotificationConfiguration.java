package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.notification.EnableNotificationModule;

@EnableNotificationModule
@DependentModule(AdminConfiguration.class)
public class NotificationConfiguration {
}
