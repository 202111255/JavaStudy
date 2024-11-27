package org.example.di;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public HelloBean1 helloBean1() {
        return new HelloBean1();
    }
    @Bean
    public HelloBean2 helloBean2() {
        return new HelloBean2();
    }

    @Bean
    public Hello hello1() {
        return new HelloBean1();
    }

    @Bean
    public Hello hello2() {
        return new HelloBean2();
    }

    @Bean(name = "helloBean")
    public HelloBean1 helloBean3() {
        return new HelloBean1();
    }
}
