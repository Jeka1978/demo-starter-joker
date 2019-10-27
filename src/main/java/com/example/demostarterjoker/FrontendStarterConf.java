package com.example.demostarterjoker;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(ChuckNorris.class)
@EnableScheduling
public class FrontendStarterConf {
    @Bean
    public FrontendAspect frontendAspect(){
        return new FrontendAspect();
    }

    @Bean
    @ConditionalOnProperty(name = "chuck.quote")
    public ChuckNorrisQuoterService chuckNorrisQuoterService(){
        return new ChuckNorrisQuoterService();
    }
}
