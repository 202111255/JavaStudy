package org.example.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
    private DataSource dataSource;
    //DataSource 생성
    public BoardDAO() {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            this.dataSource = (DataSource) envCtx.lookup("jdbc/mariadb1");
        } catch (NamingException e) {
            System.out.println("[에러] " + e.getMessage());
        }
    }

    //board_list1.jsp의 데이터 처리
    public ArrayList<BoardTO> boardList() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        ArrayList<BoardTO> lists = new ArrayList();

        try {
            conn = this.dataSource.getConnection();

            //절대 비밀번호를 같이 가져오면 안됨
            String sql = "select seq, subject, writer, wdate, hit from board1 order by seq desc";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                BoardTO to = new BoardTO();
                to.setSeq(rs.getString("seq"));
                to.setSubject(rs.getString("subject"));
                to.setWriter(rs.getString("writer"));
                to.setWdate(rs.getString("wdate").replaceAll("-", "/"));
                to.setHit(rs.getString("hit"));

                lists.add(to);
            }

        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
        }
        return lists;
    }

    public BoardTO boardView( BoardTO to ) {
        System.out.println( "boardView 호출" );

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = this.dataSource.getConnection();

            String sql = "update board1 set hit=hit+1 where seq=?";
            pstmt = conn.prepareStatement( sql );
            pstmt.setString( 1, to.getSeq() );

            pstmt.executeUpdate();

            sql = "select subject, writer, mail, wip, wdate, hit, content from board1 where seq=?";
            pstmt = conn.prepareStatement( sql );
            pstmt.setString( 1, to.getSeq() );

            rs = pstmt.executeQuery();

            if ( rs.next() ) {
                to.setSubject( rs.getString( "subject" ) );
                to.setWriter( rs.getString( "writer" ) );
                to.setMail( rs.getString( "mail" ) );
                to.setWip( rs.getString( "wip" ) );
                to.setWdate( rs.getString( "wdate" ) );
                to.setHit( rs.getString( "hit" ) );
                to.setContent( rs.getString( "content" ).replaceAll( "\n", "<br />" ) );
            }

        } catch ( SQLException e ) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if ( rs != null ) try { rs.close(); } catch( SQLException e ) {}
            if ( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
            if ( conn != null ) try { conn.close(); } catch( SQLException e ) {}
        }
        return to;
    }

    public void boardWrite() {

    }

    public int boardWriteOk(BoardTO to) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int flag = 1;

        try {

            conn = this.dataSource.getConnection();
            String sql = "insert into board1 values (0, ?, ?, ?, password(?), ?, 0, ?, now())";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, to.getSubject());
            pstmt.setString(2, to.getWriter());
            pstmt.setString(3, to.getMail());
            pstmt.setString(4, to.getPassword());
            pstmt.setString(5, to.getContent());
            pstmt.setString(6, to.getWip());

            int result = pstmt.executeUpdate();
            if ( result == 1 ) {
                // 정상
                flag = 0;
            }

        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
        return flag;
    }

    public BoardTO boardModify(BoardTO to) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            conn = this.dataSource.getConnection();

            //절대 비밀번호를 같이 가져오면 안됨
            String sql = "select subject, writer, mail, content from board1 where seq = ? order by seq desc";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, to.getSeq());

            rs = pstmt.executeQuery();

            //하나만 가져오면 되니까 if 걸어주기
            if(rs.next()) {
                to.setSubject(rs.getString("subject"));
                to.setWriter(rs.getString("writer"));
                if (rs.getString("mail").equals("")) {
                    to.setMail("@");
                } else {
                    to.setMail(rs.getString("mail"));
                }
                to.setContent(rs.getString("content"));
            }


        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
        }
        return to;
    }

    public int boardModifyOk(BoardTO to) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        //에러를 감별할 변수
        int flag = 2;

        try {
            conn = this.dataSource.getConnection();

            //비밀번호는 select 하지 않음
            String sql = "update board1 set subject=?, mail=?, content=? where seq=? and password=password(?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, to.getSubject());
            pstmt.setString(2, to.getMail());
            pstmt.setString(3, to.getContent());
            pstmt.setString(4, to.getSeq());
            pstmt.setString(5, to.getPassword());

            int result = pstmt.executeUpdate();
            if ( result == 0 ) {
                //비밀번호가 오류
                flag = 1;
            } else if (result == 1) {
                //정상
                flag = 0;
            }

        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try{ conn.close(); } catch (SQLException e) {}
        }
        return flag;
    }

    public BoardTO boardDelete(BoardTO to) {


        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = this.dataSource.getConnection();

            //절대 비밀번호를 같이 가져오면 안됨
            String sql = "select subject, writer from board1 where seq = ? order by seq desc";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, to.getSeq());

            rs = pstmt.executeQuery();

            //하나만 가져오면 되니까 if 걸어주기
            if(rs.next()) {
                to.setSubject(rs.getString("subject"));
                to.setWriter(rs.getString("writer"));
            }

        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
        }
        return to;
    }

    public int boardDeleteOk(BoardTO to) {
        String seq = to.getSeq();
        String password = to.getPassword();

        Connection conn = null;
        PreparedStatement pstmt = null;

        //에러를 감별할 변수
        int flag = 2;

        try {

            conn = this.dataSource.getConnection();

            //비밀번호는 select 하지 않음
            String sql = "delete from board1 where seq=? and password=password(?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, seq);
            pstmt.setString(2, password);

            int result = pstmt.executeUpdate();
            if ( result == 0 ) {
                //비밀번호가 오류
                flag = 1;
            } else if (result == 1) {
                //정상
                flag = 0;
            }

        } catch (SQLException e) {
            System.out.println("에러 :"+ e.getMessage());
        }
        finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) {};
            if (conn != null) try{ conn.close(); } catch (SQLException e) {};
        }


        return flag;
    }



}
