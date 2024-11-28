package com.example.board.mapper;

import com.example.board.dto.BoardTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardMapper {
    ArrayList<BoardTO> list();
    BoardTO view(BoardTO to);
    void view_hit(BoardTO to);
    //void write();
    int write_ok(BoardTO to);
    BoardTO modify(BoardTO to);
    int modify_ok(BoardTO to);
    BoardTO delete(BoardTO to);
    int delete_ok(BoardTO to);
}
