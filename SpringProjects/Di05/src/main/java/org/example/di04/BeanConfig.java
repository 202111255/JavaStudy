package org.example.di04;

import org.example.di03.HelloBean;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public WriteAction writeAction1() {
        //디폴트 생성자
        return new WriteAction();
    }

    @Bean
    public WriteAction writeAction2() {
        //생성자 주입
        return new WriteAction(new BoardTO());
    }

    public BoardTO boardTO() {
        return new BoardTO();
    }
    @Bean
    public WriteAction writeAction3() {
        //생성자 주입
        return new WriteAction(boardTO());
    }
}
