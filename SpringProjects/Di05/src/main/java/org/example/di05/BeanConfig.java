package org.example.di05;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    @Bean
    public BoardTO boardTO() {
        BoardTO to = new BoardTO();
        to.setSeq(1);
        to.setSubject("제목 1");
        return to;
    }
}
