package com.example.album.dao;

import com.example.album.dto.AlbumTO;
import com.example.album.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AlbumDAO {

    @Autowired
    private AlbumMapper albumMapper;

    public ArrayList<AlbumTO> boardList() {
        return albumMapper.list();
    }

    public int boardWriteOk(AlbumTO to) {
        int flag = 1;

        int result = albumMapper.write_ok(to);

        if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

}
