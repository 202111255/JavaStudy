package org.example.boot.config;

import org.example.boot.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:data.properties")
public class BeanConfig {


    @Bean
    public User user() {
        return new User();
    }
}
