package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.application.EnableApplicationModule;

@EnableApplicationModule
@DependentModule(UserConfiguration.class)
public class ApplicationConfiguration {
}
