package com.devops.config;

import com.devops.backend.service.EmailService;
import com.devops.backend.service.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by dtruong1801 on 8/28/17.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/devops/dev-gradle-thymeleaf/.devops/application-dev.properties")
public class DevelopmentConfig {

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
