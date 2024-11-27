package org.example.di08;


import org.springframework.stereotype.Component;

@Component
public class BoardDAO {
    public BoardDAO() {
        System.out.println("BoardDAO 생성자 호출");
    }
}
