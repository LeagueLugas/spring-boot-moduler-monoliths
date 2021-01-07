package kr.hs.entrydsm.main.confniguration;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.*;

public class MunchkinApplicationBuilder {

    private SpringApplicationBuilder springBuilder;
    private final Queue<Class<?>> registeredModules = new LinkedList<>();

    public MunchkinApplicationBuilder(Class<?> mainClass) {
        springBuilder = new SpringApplicationBuilder()
                .sources(mainClass);
    }

    public MunchkinApplicationBuilder properties(String properties) {
        springBuilder.properties(properties);
        return this;
    }

    @SneakyThrows
    public SpringApplication build(String... args) {
        registerModules();
        return springBuilder.build(args);
    }

    public void registerModules() {
        registerDependency(ContextConfiguration.Notification.class);

        springBuilder = springBuilder.sibling(ContextConfiguration.Web.class).web(WebApplicationType.SERVLET);
    }

    private void registerDependency(Class<?> module) {
        if (isAlreadyRegistered(module)) return;
        if (isTopLevelDependency(module)) {
            springBuilder = springBuilder.child(module).web(WebApplicationType.NONE);
        } else {
            registerDependency(getDependencyModule(module));
            springBuilder = springBuilder.sibling(module).web(WebApplicationType.NONE);
        }
        registeredModules.add(module);
    }

    private Class<?> getDependencyModule(Class<?> module) {
        return module.getAnnotation(DependentModule.class).value();
    }

    private boolean isTopLevelDependency(Class<?> clazz) {
        return clazz.getAnnotation(DependentModule.class) == null;
    }

    private boolean isAlreadyRegistered(Class<?> clazz) {
        return registeredModules.contains(clazz);
    }

}
