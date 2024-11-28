package com.example.board.dao;


import com.example.board.dto.PdsTO;
import com.example.board.mapper.PdsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PdsDAO {

    @Autowired
    private PdsMapper pdsMapper;

    public ArrayList<PdsTO> boardList() {
        return pdsMapper.list();
    }

    public PdsTO boardView(PdsTO to) {
        pdsMapper.view_hit(to);
        return pdsMapper.view(to);
    }

    public int boardWriteOk(PdsTO to) {
        int flag = 1;

        int result = pdsMapper.write_ok(to);

        if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public PdsTO boardModify(PdsTO to) {
        return pdsMapper.modify(to);
    }

    public int boardModifyOK(PdsTO to) {
        int flag = 2;

        int result = pdsMapper.modify_ok(to);

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public  PdsTO boardDelete(PdsTO to) {
        return pdsMapper.delete(to);
    }

    public int boardDeleteOK(PdsTO to) {
        int flag = 2;

        int result = pdsMapper.delete_ok(to);

        if( result == 0 ) {
            flag = 1;
        } else if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

}