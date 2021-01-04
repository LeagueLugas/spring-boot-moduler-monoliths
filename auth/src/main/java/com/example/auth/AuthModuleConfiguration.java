package com.example.auth;

import com.example.common.context.beans.PublishedComponentRegisteringPostProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ComponentScan(basePackageClasses = AuthModuleConfiguration.class)
@EnableConfigurationProperties
public class AuthModuleConfiguration implements ApplicationRunner {

    @Bean
    public PublishedComponentRegisteringPostProcessor authPublishedComponentRegisteringPostProcessor(ConfigurableListableBeanFactory beanFactory) {
        return new PublishedComponentRegisteringPostProcessor(beanFactory);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Started Auth module");
    }

}
