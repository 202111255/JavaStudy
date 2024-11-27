package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@Bean
@Service("writeAction")
public class WriteAction {

    @Autowired
    private BoardDAO dao;

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
        System.out.println("1 : " + dao);
    }

    public void getDao() {
        System.out.println("2 : " + dao);
    }
}
