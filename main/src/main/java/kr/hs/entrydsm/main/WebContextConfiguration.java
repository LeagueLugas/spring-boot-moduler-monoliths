package kr.hs.entrydsm.main;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Objects;

@Configuration
@EnableAutoConfiguration
@RequiredArgsConstructor
public class WebContextConfiguration {

    private final ConfigurableListableBeanFactory beanFactory;
    private final ApplicationContext context;

    @PostConstruct
    public void setup() {
        ApplicationContext parentContext = context.getParent();
        Map<String, Object> restControllerBeans = Objects.requireNonNull(parentContext).getBeansWithAnnotation(RestController.class);

        for (String beanName : restControllerBeans.keySet()) {
            beanFactory.registerSingleton(beanName, restControllerBeans.get(beanName));
        }
    }

}
