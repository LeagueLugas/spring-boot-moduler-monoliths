package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.admin.EnableAdminModule;

@EnableAdminModule
@DependentModule(UserConfiguration.class)
public class AdminConfiguration {
}
