package com.example.board.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BoardDAO {
    private final Logger logger = LoggerFactory.getLogger( this.getClass().getName() );

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ArrayList<BoardTO> boardList(){
        String sql = "select seq, subject, writer, date_format(wdate, '%Y-%m-%d') wdate, hit, datediff(now(), wdate) wgap from board1 order by seq desc";
        ArrayList<BoardTO> lists = (ArrayList<BoardTO>)jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(BoardTO.class));
        logger.info( "logger :{} ", "데이터 개수 : " + lists.size() );

        return lists;
    }

    public int boardWriteOk(BoardTO to) {
        // 처리에 대한 결과
        int flag = 1;

        String sql = "insert into board1 values ( 0, ?, ?, ?, password( ? ), ?, 0, ?, now() )";
        int result = jdbcTemplate.update(
                sql,
                to.getSubject(), to.getWriter(), to.getMail(), to.getPassword(), to.getContent(), to.getWip() );
        if( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    // prototype
    public BoardTO boardView(BoardTO to) {

        String sql = "update board1 set hit = hit + 1 where seq=?";
        int result = jdbcTemplate.update( sql, to.getSeq() );

        sql = "select seq, subject, writer, mail, wip, wdate, hit, content from board1 where seq=?";
        to = jdbcTemplate.queryForObject( sql, new BeanPropertyRowMapper<>( BoardTO.class ), to.getSeq() );

        return to;
    }

    public BoardTO boardModify(BoardTO to) {

        String sql = "select seq, subject, writer, mail, content from board1 where seq=?";
        to = jdbcTemplate.queryForObject( sql, new BeanPropertyRowMapper<>( BoardTO.class ), to.getSeq() );

        return to;
    }

    public int boardModifyOK(BoardTO to) {
        int flag = 2;

        String sql = "update board1 set subject=?, mail=?, content=? where seq=? and password=password( ? )";
        int result = jdbcTemplate.update(
                sql,
                to.getSubject(), to.getMail(), to.getContent(), to.getSeq(), to.getPassword() );

        if ( result == 0 ) {
            flag = 1;
        } else if ( result == 1 ) {
            flag = 0;
        }

        return flag;
    }

    public BoardTO boardDelete(BoardTO to) {

        String sql = "select seq, subject, writer from board1 where seq=?";
        to = jdbcTemplate.queryForObject( sql, new BeanPropertyRowMapper<>( BoardTO.class ), to.getSeq() );


        return to;
    }

    public int boardDeleteOK(BoardTO to) {
        int flag = 2;

        String sql = "delete from board1 where seq=? and password=password( ? )";
        int result = jdbcTemplate.update( sql, to.getSeq(), to.getPassword() );

        if ( result == 0 ) {
            flag = 1;
        } else if ( result == 1 ) {
            flag = 0;
        }

        return flag;
    }
}
