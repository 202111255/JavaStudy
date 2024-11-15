package org.example.di07;

import org.springframework.context.annotation.Bean;

public class BeanConfig1 {
    @Bean
    public HelloBean1 helloBean1() {
        return new HelloBean1();
    }
}
