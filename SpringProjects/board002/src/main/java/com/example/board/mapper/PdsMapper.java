package com.example.board.mapper;

import com.example.board.dto.PdsTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PdsMapper {
    ArrayList<PdsTO> list();
    PdsTO view(PdsTO to);
    void view_hit(PdsTO to);
    //void write();
    int write_ok(PdsTO to);
    String filename(PdsTO to);
    PdsTO modify(PdsTO to);
    int modify_ok1(PdsTO to);
    int modify_ok2(PdsTO to);
    PdsTO delete(PdsTO to);
    int delete_ok(PdsTO to);
}
