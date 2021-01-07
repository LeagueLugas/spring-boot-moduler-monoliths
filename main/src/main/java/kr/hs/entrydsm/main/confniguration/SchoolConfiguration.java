package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.school.EnableSchoolModule;

@EnableSchoolModule
@DependentModule(ApplicationConfiguration.class)
public class SchoolConfiguration {
}
