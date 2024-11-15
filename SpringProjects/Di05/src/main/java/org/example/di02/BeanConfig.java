package org.example.di02;

import org.example.di02.HelloBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BeanConfig {
    @Bean
    @Scope(value = "prototype")
    //@Scope("prototype")
    public HelloBean1 helloBean1() {
        return new HelloBean1();
    }

    @Bean
    public HelloBean1 helloBean2() {
        return new HelloBean1();
    }
}
