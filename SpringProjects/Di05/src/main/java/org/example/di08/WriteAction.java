package org.example.di08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WriteAction {
    @Autowired
    private BoardDAO dao;

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
    }

    public BoardDAO getDao() {
        System.out.println("dao : " + dao);
        return dao;
    }
}
