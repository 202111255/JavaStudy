package org.example.di03;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public HelloBean helloBean1() {
        //디폴트 생성자
        return new HelloBean();
    }

    @Bean
    public HelloBean helloBean2() {
        //생성자 주입
        return new HelloBean("홍길동");
    }
}
