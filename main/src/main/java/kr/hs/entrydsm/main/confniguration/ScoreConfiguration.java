package kr.hs.entrydsm.main.confniguration;

import kr.hs.entrydsm.score.EnableScoreModule;

@EnableScoreModule
@DependentModule(ApplicationConfiguration.class)
public class ScoreConfiguration {
}
